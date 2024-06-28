import { publicSharedHello as sharedHello } from "shared";

export function aJsFunctionThatWillCallAnotherJsFunctionDeclaredInKotlinSourceOfAnotherModule() {
    return sharedHello();
}