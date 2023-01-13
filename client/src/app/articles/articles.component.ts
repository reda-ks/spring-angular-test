import { HttpErrorResponse } from '@angular/common/http';
import { Component, Input, OnInit } from '@angular/core';
import { Article } from '../Article';
import { ArticleServiceService } from '../article-service.service';

@Component({
  selector: 'app-articles',
  templateUrl: './articles.component.html',
  styleUrls: ['./articles.component.css'],
})
export class ArticlesComponent implements OnInit {
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
