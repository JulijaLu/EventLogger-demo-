package seb.restful.api.controller;

import org.springframework.web.bind.annotation.*;
import seb.restful.api.mapper.EventMapper;
import seb.restful.api.model.Event;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventsController {

    EventMapper eventMapper;

    public EventsController(EventMapper eventMapper) {
        this.eventMapper = eventMapper;
    }

    @GetMapping("/all")
    public List<Event> getAllEvents() {
        return eventMapper.findAll();
    }

    @GetMapping("/{id}")
    public Event getEventById(@PathVariable("id") int id) {
        return eventMapper.findById(id);
    }

    @PostMapping("/create")
    public void createEvent(@RequestBody Event event) {
        eventMapper.createEvent(event);
    }

    @PutMapping("/update/{id}")
    public void updateEvent(@PathVariable("id") int id) {
        eventMapper.updateEvent(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEvent(@PathVariable("id") int id) {
        eventMapper.deleteEvent(id);
    }

}
