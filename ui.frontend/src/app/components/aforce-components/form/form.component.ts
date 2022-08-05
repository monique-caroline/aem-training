import { Component, Input } from '@angular/core';
import {MapTo} from '@adobe/cq-angular-editable-components';

const formEditConfig = {
  emptyLabel: 'form',
  isEmpty: cqModel =>
    !cqModel || !cqModel.items || cqModel.items().length < 1
};

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent {

  @Input() items: string;

  constructor() { }

}

MapTo('wknd-spa-angular/components/aforce-components/form')(FormComponent, formEditConfig);
