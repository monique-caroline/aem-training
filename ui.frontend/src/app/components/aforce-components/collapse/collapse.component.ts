import { Component, Input } from '@angular/core';
import {MapTo} from '@adobe/cq-angular-editable-components';

const collapseEditConfig = {
  emptyLabel: 'collapse',
  isEmpty: cqModel =>
    !cqModel || !cqModel.items || cqModel.items().length < 1
};

@Component({
  selector: 'app-collapse',
  templateUrl: './collapse.component.html',
  styleUrls: ['./collapse.component.scss']
})
export class CollapseComponent {

  @Input() items: string;

  constructor() { }

}

MapTo('wknd-spa-angular/components/aforce-components/collapse')(CollapseComponent, collapseEditConfig);
