package com.akash.conferencedemo.controllers;

import com.akash.conferencedemo.models.Session;
import com.akash.conferencedemo.repositories.SessionRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sessions")
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    @GetMapping
    public List<Session> List(){
        return sessionRepository.findAll();
    }

    @GetMapping
    @RequestMapping("{id}")
    public Session get(@PathVariable Long id){
        return sessionRepository.getOne(id);
    }

    @PostMapping
    public Session create(@RequestBody final Session session){
        return sessionRepository.saveAndFlush(session);
    }



    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
   public void delete(@RequestBody Long id){
        System.out.println("delete called");
        sessionRepository.deleteById(id);
   }

   @RequestMapping(value={"id"},method = RequestMethod.PUT)
   public Session update(@PathVariable Long id,@RequestBody Session session){
        Session existingSession = sessionRepository.getOne(id);
       BeanUtils.copyProperties(session,existingSession,"session_id");
       return sessionRepository.saveAndFlush(existingSession);
   }

}
