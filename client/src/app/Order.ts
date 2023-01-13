import { Time } from '@angular/common';

export interface Order {
  id: number;
  reference: string;
  new (): Date;
  date: Date;
}
