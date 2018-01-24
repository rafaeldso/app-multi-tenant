package com.rafael.multitenancy.controller;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rafael.multitenancy.model.Empregado;
import com.rafael.multitenancy.repository.EmpregadosRepository;

@Controller
@RequestMapping("/{tenantid}")
public class EmployeeController {

 @Autowired
 private EmpregadosRepository empregadoRepository;

 @PersistenceContext
 private EntityManager entityManager;

 @RequestMapping
 public String employees(@PathVariable String tenantid, Model model) {
  model.addAttribute("tenantid", tenantid);
  model.addAttribute("employee", new Empregado());
  model.addAttribute("employees", empregadoRepository.findAll());
  return "empregado";
 }

 @RequestMapping(value = "/add", method = RequestMethod.POST)
 @Transactional
 public String addEmployee(@ModelAttribute Empregado empregado, Model model) {
  empregadoRepository.save(empregado);
  return "redirect:/{tenantid}";
 }
}