import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Order } from '../Order';
import { OrdreServiceService } from '../ordre-service.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css'],
})
export class OrderComponent implements OnInit {
  public order: Order[] = [];

  constructor(private orderService: OrdreServiceService) {}

  ngOnInit(): void {
    this.getOrder();
  }
  public getOrder(): void {
    this.orderService.getOrder().subscribe(
      (response: Order[]) => {
        this.order = response;
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
}
