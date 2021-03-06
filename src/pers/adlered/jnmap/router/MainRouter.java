package pers.adlered.jnmap.router;

import pers.adlered.jnmap.logger.Log;
import pers.adlered.jnmap.logger.enumerate.Level;
import pers.adlered.jnmap.router.mode.AfterModeRouter;
import pers.adlered.jnmap.router.sub.LangRouter;
import pers.adlered.jnmap.variable.DefaultConfig;

/**
 * <h3>JNmap</h3>
 * <p></p>
 *
 * @author : https://github.com/AdlerED
 * @date : 2019-11-13 15:26
 **/
public class MainRouter {
    public MainRouter() {
        Log.log(Level.INFO, "JNmap V" + DefaultConfig.version);
        LangRouter langRouter = new LangRouter();
        langRouter.route();
        ModeRouter modeRouter = new ModeRouter();
        modeRouter.route();
        AfterModeRouter afterModeRouter = new AfterModeRouter();
        afterModeRouter.route();
    }
}
