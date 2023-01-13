import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Order } from './Order';

@Injectable({
  providedIn: 'root',
})
export class OrdreServiceService {
  private apiServerUrl = environment.apiBaseUrl;
  constructor(private http: HttpClient) {}

  public getOrder(): Observable<Order[]> {
    return this.http.get<Order[]>(`${this.apiServerUrl}/orders`);
  }
}
