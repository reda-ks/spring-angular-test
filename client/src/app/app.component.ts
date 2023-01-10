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
  public article: Article[] = [];

  constructor(private articleService: ArticleServiceService) {}
  ngOnInit(): void {
    this.getArticle();
  }

  public getArticle(): void {
    this.articleService.getArticle().subscribe(
      (response: Article[]) => {
        this.article = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
