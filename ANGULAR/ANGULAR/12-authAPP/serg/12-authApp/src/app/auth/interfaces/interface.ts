
export interface AuthResponse {
    ok: boolean,
    uid?: string;
    name?: string;
    token?: string;
    msg?: string;
}

export interface Usuario {
    uid: string;
    name: string;
}