import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CostomersaveComponent } from './costomersave/costomersave.component';
import { CustomerbyidComponent } from './customerbyid/customerbyid.component';
import { CustomerlistComponent } from './customerlist/customerlist.component';

const routes: Routes = [
  {path:"list",component:CustomerlistComponent},
  {path:"listbyid",component:CustomerbyidComponent},
  {path:"save",component:CostomersaveComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
