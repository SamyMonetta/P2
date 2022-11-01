import { SubscriptionLoggable } from "rxjs/internal/testing/SubscriptionLoggable";

export class JwtDto {
    token!: string;
    type!: string;
    nombreUsuario!: string;
    authorities!: string[];
}
