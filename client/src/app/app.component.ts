import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Article } from './Article';
import { ArticleServiceService } from './article-service.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit {
  hide:boolean=false;
  constructor() {}
  ngOnInit(): void {
  }
  show(){
    this.hide=true;
  }

  
}
