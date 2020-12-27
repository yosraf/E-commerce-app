import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard.component';
import {LazyElementsModule} from '@angular-extensions/elements';

@NgModule({
  declarations: [DashboardComponent],
  imports: [
    CommonModule,
    LazyElementsModule

  ],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  exports :[DashboardComponent]
})
export class DashboardModule { }
