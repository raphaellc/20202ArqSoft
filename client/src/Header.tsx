import React from 'react';
import './App.css';
import userIcon from './assets/person_110935.svg'
import menu from './assets/lines_menu_burger_icon_123889.svg'

interface HeaderProps {
    path: string
}


function Menu() {
    function expandMenu(){
        console.log("expanding menu")
    }

    function expandUserOptions(){
        console.log("expanding user options")
    }

    return (
        <div style={{display: "flex", flexDirection: "row", padding: 10}}>
            <div className="header-icons" onClick={expandMenu}><img src={menu} /></div>
            <div className="header-icons" onClick={expandUserOptions}><img src={userIcon}/></div>
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