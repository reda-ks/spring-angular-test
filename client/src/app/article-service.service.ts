import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Article } from './Article';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root',
})
export class ArticleServiceService {
  private apiServerUrl = environment.apiBaseUrl;
  constructor(private http: HttpClient) {}

  public getArticle(): Observable<Article[]> {
    return this.http.get<Article[]>(`${this.apiServerUrl}/articles`);
  }

  public addArticle(article: Article): Observable<Article> {
    return this.http.post<Article>(`${this.apiServerUrl}/articles`, article);
  }
}
