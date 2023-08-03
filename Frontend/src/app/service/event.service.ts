import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Event } from '../model/event.model';

@Injectable({
    providedIn: 'root'
})
export class EventService {
    private apiUrl = 'http://localhost:8081/event-management/events';

    constructor(private http: HttpClient) { }

    getAllEvents(): any {
        // write your code here
        return null;
    }

    getEventById(id: number): any {
        // write your code here
        return null;
    }

    createEvent(event: Event): any {
        // write your code here
        return null;
    }

    updateEvent(id: number, event: Event): any {
        // write your code here
        return null;
    }

    deleteEvent(id: number): any {
        // write your code here
        return null;
    }

    searchEventsByName(name: string): any {
        // write your code here
        return null;
    }

    searchEventsByStatus(status: boolean): any {
        // write your code here
        return null;
    }
}
