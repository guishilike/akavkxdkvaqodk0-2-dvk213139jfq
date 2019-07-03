package edu.neu.hospital.service.registerAndCharge;


import edu.neu.hospital.bean.tollBean.*;
import edu.neu.hospital.dto.IdDTO;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface TollService {
    /**
     * 检查收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param  payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    List<TollInspectView> tollInspection(String search, Date startDate, Date endDate, Integer payStatus);

    /**
     * 处置收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param  payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    List<TollDisposalView> tolldisposal(String search, Date startDate, Date endDate, Integer payStatus);

    /**
     * 处方收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param  payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    List<TollPresView> tollpres(String search, Date startDate, Date endDate, Integer payStatus);

    /**
     * 材料收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    List<TollMatView> tollmat(String search, Date startDate, Date endDate, Integer payStatus);

    /**
     * 项目药品收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    List<TollMedView> tollmed(String search, Date startDate, Date endDate, Integer payStatus);

    /**
     * 挂号收费搜索表单信息
     *
     * @param search    收费搜索表单搜索框的内容
     * @param startDate 开始时间
     * @param endDate   结束时间
     * @param payStatus 付费状态
     * @return 收费搜索结果表单信息
     */

    List<TollRegView> tollreg(String search, Date startDate, Date endDate, Integer payStatus);


    /**
     * 缴费
     *
     * @param feeIDs 缴费编号
     * @param tollManID 收费员编号
     * @return 缴费结果
     */
    String toll(IdDTO feeIDs, Integer tollManID);



    /**
     * 退费
     *
     * @param feeIDs 退费编号
     * @param tollManID 收费员编号
     * @return 退费结果
     */
    String refund(IdDTO feeIDs, Integer tollManID);


    /**
     * 日结
     *
     * @param tollManID 日结员编号
     * @param endDate 日结日期
     * @return 日结结果
     */
    Map<String,Date> dailySettle(Integer tollManID, Date endDate);


    /**
     * 日结信息查询
     *
     * @param tollManID 日结员编号
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 日结信息
     */
    List<DailySettleView>  dailySettleSearch(Integer tollManID, Date startDate, Date endDate);


    /**
     * 日结收费查询
     *
     * @param tollManID 日结员编号
     * @param startDate 开始日期
     * @param endDate 结束日期
     * @return 日结收费信息
     */
   List<FeeView> dailySettleFee(Integer tollManID, Date startDate, Date endDate);


}
