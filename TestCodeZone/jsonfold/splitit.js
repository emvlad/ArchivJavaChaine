var split_at =' ';
var listStore =[];
var stringByChar="";
for(i=0; i<msg.payload.length; i++){
    stringByChar += msg.payload.charAt(i);
    if(msg.payload.charAt(i)==split_at){
        listStore.push(stringByChar);
        stringByChar="";
    }
}

if(stringByChar.length>0) listStore.push(stringByChar);
return {payload : listStore};
