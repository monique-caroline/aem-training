import { Component, Input } from '@angular/core';
import { MapTo } from '@adobe/cq-angular-editable-components';

const cardEditConfig = {
  emptyLabel: 'card',
  isEmpty: cqModel =>
    !cqModel || !cqModel.title || cqModel.title.trim().length < 1
};

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.scss']
})
export class CardAforceComponent {

  @Input() title: string;
  @Input() description: string;
  @Input() imagePath: string;

}

MapTo('wknd-spa-angular/components/aforce-components/card')(CardAforceComponent, cardEditConfig);
