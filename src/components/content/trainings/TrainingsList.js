import CardComponent from "../../CardComponent";
import classes from './TrainingsList.module.css'
import {Link} from "react-router-dom";
import {Button} from "@material-ui/core";

const TrainingsList = () => {
    return (
        <div>
            <div className={classes.AddButtonContainer}>
                <Link to={"/trainings/add"}
                      className={classes.TrainingsAddButton}>
                    <Button variant="outlined">Add New</Button>
                </Link>
            </div>
            <CardComponent title={'Trainings List'}>
                <div className={classes.TableContainer}>

                </div>
            </CardComponent>
        </div>
    )
}

export default TrainingsList;