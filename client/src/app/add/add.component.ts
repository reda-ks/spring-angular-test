import { HttpErrorResponse } from '@angular/common/http';
import { Component, Input, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Article } from '../Article';
import { ArticleServiceService } from '../article-service.service';

@Component({
  selector: 'app-add',
  templateUrl: './add.component.html',
  styleUrls: ['./add.component.css'],
})
export class AddComponent implements OnInit {
  constructor(private articleService: ArticleServiceService) {}
  public article: Article[] = [];

  ngOnInit(): void {}

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
  public onAddArticle(addForm: NgForm): void {
    //document.getElementById('add-employee-form').click();
    this.articleService.addArticle(addForm.value).subscribe(
      (response: Article) => {
        console.log(response);
        this.getArticle();
        addForm.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        addForm.reset();
      }
    );
  }
  confirmation() {
    return alert('ajout est bien effectué');
  }
}
