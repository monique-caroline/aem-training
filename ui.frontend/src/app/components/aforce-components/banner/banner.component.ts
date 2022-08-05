import { Component, Input } from '@angular/core';
import { MapTo } from '@adobe/cq-angular-editable-components';

const bannerEditConfig = {
  emptyLabel: 'banner',
  isEmpty: cqModel =>
    !cqModel || !cqModel.items || cqModel.items.length < 1
};

@Component({
  selector: 'app-banner',
  templateUrl: './banner.component.html',
  styleUrls: ['./banner.component.scss']
})
export class BannerComponent {

  @Input() items: object[];

}

MapTo('wknd-spa-angular/components/aforce-components/banner')(BannerComponent, bannerEditConfig);
