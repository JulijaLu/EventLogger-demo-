package seb.restful.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import seb.restful.api.model.Event;
import seb.restful.api.service.EventServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventsController {

    @Autowired
    private EventServiceImpl eventService;

    @GetMapping("/")
    public List<Event> getAllEvents() {
        return eventService.findAll();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable("id") int id) {
        return eventService.findById(id);
    }

    @PostMapping("/create")
    public void createEvent(@RequestBody Event event) {
        eventService.createEvent(event);
    }

    @PutMapping("/update/{id}")
    public void updateEvent(@PathVariable("id") int id) {
        eventService.updateEvent(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEvent(@PathVariable("id") int id) {
        eventService.delete(id);
    }

}
