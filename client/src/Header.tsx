import React from 'react';
import './App.css';

interface HeaderProps {
    path: string
}


function Menu(){
    function expandMenu(){
        console.log("expanding menu")
    }

    function expandUserOptions(){
        console.log("expanding user options")
    }

    return(<div>
            <div onClick={expandMenu}>M</div>
            <div onClick={expandUserOptions}>H</div>
        </div>)
}

function BreadCrumb({ path }: HeaderProps) {
    return (<div>
            <p style={{fontFamily: "Segoe UI, sans-serif", fontSize:12, color:"darkgray", padding: 20}}>
                {path}
            </p>
        </div>)
}



export default function Header({ path }: HeaderProps) {
    return (
        <div id="header">
            <BreadCrumb path={path}/>
            <Menu/>
        </div>
    );
  }