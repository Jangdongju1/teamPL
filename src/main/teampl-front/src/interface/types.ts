// 프로젝트 객체

// 프로젝트 객체
export type Project = {
    projectNum: number,
    regNum: number | null,
    projectName: string,
    description: string,
    createDate: string,
    creator: string,
    stat: number,
    projectType: number
}
//프로젝트 탐색용 모달에 존재하는 프로젝트 리스트의 객체 타입
export type ProjectListEle = {
    projectNum : number,
    projectName: string,
    owner : string,
    projectType : number
    stat : number,
    teamName : string | null;   // 개인프로젝트 일 경우에 null 일 수 있음.
}

// 이슈객체
export type Issue = {
    issueNum: number,
    projectNum: number,
    email: string,
    title: string,
    content: string,
    inCharge: string,
    priority: number,
    writeDate: string,
    expireDate: string,
    stat: number,
    category: number,
    issueSequence: string,
    previousNode: string | null,
    nextNode: string | null,
}

// 이슈에 대한 코멘트 정의
export type IssueComment = {
    email: string,
    picture: string | null
    commentNum: number
    issueNum: number,
    content: string,
    writeDate: string,
    commentLevel: number,
    commentGroup: number,
    commentOrder: number
}


