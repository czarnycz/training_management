import classes from '../App.module.css'
import {Route, Switch} from "react-router-dom";

const AppContent = () => {

    return(
        <div className={classes.AppContent}>
            <Switch>
                <Route path={'/form'}>
                    <AppContentForm/>
                </Route>
                <Route path={'/database'}>
                    <AppContentDatabase/>
                </Route>
                <Route path={'/'}>
                    <AppContentHome/>
                </Route>
            </Switch>
        </div>
    )
}

export default AppContent;