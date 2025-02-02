package com.persnal.teampl.repository.queryDSL;

import com.persnal.teampl.dto.obj.IssueObj;
import com.persnal.teampl.dto.obj.temp.TeamIssueInfoFetchData;
import com.persnal.teampl.entities.IssueCommentEntity;

import java.util.List;

public interface IssueCustomRepository {
    TeamIssueInfoFetchData getTeamIssueInfo(Integer issueNum , Integer regNum);
    List<IssueCommentEntity> getIssueCommentList(Integer issueNum, Integer page, Integer perPage);
    List<IssueObj> getIssueList(Integer projectNum);

}
