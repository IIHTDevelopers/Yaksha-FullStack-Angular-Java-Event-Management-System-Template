import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Event } from '../model/event.model';
import { EventService } from '../service/event.service';

@Component({
    selector: 'app-event-management',
    templateUrl: './event-management.component.html',
    styleUrls: []
})
export class EventManagementComponent implements OnInit {
    events: Event[] = [];
    eventForm!: FormGroup;
    searchForm!: FormGroup;

    constructor() { }

    get f() {
        return this.eventForm.controls;
    }

    ngOnInit(): void { }

    private initSearchForm(): void { }

    loadEvents(): void { }

    onEdit(event: Event): void { }

    onDelete(event: Event): void { }

    onSubmit(): void { }

    resetSearchForm(): void { }

    onSearch(): void { }


    resetForm(): void { }
}
