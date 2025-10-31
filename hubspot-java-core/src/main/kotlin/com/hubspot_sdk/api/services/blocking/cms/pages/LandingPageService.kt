// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.AbTestCreateRequestVNext
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestEndRequestVNext
import com.hubspot_sdk.api.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot_sdk.api.models.cms.pages.BatchInputContentFolder
import com.hubspot_sdk.api.models.cms.pages.BatchInputPage
import com.hubspot_sdk.api.models.cms.pages.BatchResponseContentFolder
import com.hubspot_sdk.api.models.cms.pages.BatchResponsePage
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalContentFolderForwardPaging
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionContentFolder
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionPage
import com.hubspot_sdk.api.models.cms.pages.ContentFolder
import com.hubspot_sdk.api.models.cms.pages.ContentLanguageCloneRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.VersionContentFolder
import com.hubspot_sdk.api.models.cms.pages.VersionPage
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCloneParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateAbTestVariationParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateFolderParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageCreateParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteFolderParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageEndAbTestParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetFolderParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageGetRevisionParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListFolderRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListFoldersParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListPage
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPagePublishDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageRerunAbTestParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageResetDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageRestoreFolderRevisionParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageRestoreRevisionParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageRestoreRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateFolderParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateFoldersBatchParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageUpdateParams
import java.util.function.Consumer

interface LandingPageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LandingPageService

    /** Create a new Landing Page */
    fun create(params: LandingPageCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LandingPageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see create */
    fun create(page: Page, requestOptions: RequestOptions = RequestOptions.none()) =
        create(LandingPageCreateParams.builder().page(page).build(), requestOptions)

    /** @see create */
    fun create(page: Page) = create(page, RequestOptions.none())

    /**
     * Sparse updates a single Landing Page object identified by the id in the path. You only need
     * to specify the column values that you are modifying.
     */
    fun update(objectId: String, params: LandingPageUpdateParams): Page =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: LandingPageUpdateParams): Page = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /**
     * Get the list of landing pages. Supports paging and filtering. This method would be useful for
     * an integration that examined these models and used an external service to suggest edits.
     */
    fun list(): LandingPageListPage = list(LandingPageListParams.none())

    /** @see list */
    fun list(
        params: LandingPageListParams = LandingPageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LandingPageListPage

    /** @see list */
    fun list(params: LandingPageListParams = LandingPageListParams.none()): LandingPageListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): LandingPageListPage =
        list(LandingPageListParams.none(), requestOptions)

    /** Delete the Landing Page object identified by the id in the path. */
    fun delete(objectId: String) = delete(objectId, LandingPageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: LandingPageDeleteParams = LandingPageDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LandingPageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: LandingPageDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, LandingPageDeleteParams.none(), requestOptions)

    /** Attach a landing page to a multi-language group. */
    fun attachToLangGroup(params: LandingPageAttachToLangGroupParams) =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: LandingPageAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        attachToLangGroup(
            LandingPageAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext) =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Clone a Landing Page */
    fun clone(params: LandingPageCloneParams): Page = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: LandingPageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        clone(
            LandingPageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): Page =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createAbTestVariation(params: LandingPageCreateAbTestVariationParams): Page =
        createAbTestVariation(params, RequestOptions.none())

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        params: LandingPageCreateAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        createAbTestVariation(
            LandingPageCreateAbTestVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createAbTestVariation */
    fun createAbTestVariation(abTestCreateRequestVNext: AbTestCreateRequestVNext): Page =
        createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** Create the Landing Page objects detailed in the request body. */
    fun createBatch(params: LandingPageCreateBatchParams): BatchResponsePage =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: LandingPageCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see createBatch */
    fun createBatch(
        batchInputPage: BatchInputPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        createBatch(
            LandingPageCreateBatchParams.builder().batchInputPage(batchInputPage).build(),
            requestOptions,
        )

    /** @see createBatch */
    fun createBatch(batchInputPage: BatchInputPage): BatchResponsePage =
        createBatch(batchInputPage, RequestOptions.none())

    /** Create a new Folder */
    fun createFolder(params: LandingPageCreateFolderParams): ContentFolder =
        createFolder(params, RequestOptions.none())

    /** @see createFolder */
    fun createFolder(
        params: LandingPageCreateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /** @see createFolder */
    fun createFolder(
        contentFolder: ContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder =
        createFolder(
            LandingPageCreateFolderParams.builder().contentFolder(contentFolder).build(),
            requestOptions,
        )

    /** @see createFolder */
    fun createFolder(contentFolder: ContentFolder): ContentFolder =
        createFolder(contentFolder, RequestOptions.none())

    /** Create the Folder objects detailed in the request body. */
    fun createFoldersBatch(
        params: LandingPageCreateFoldersBatchParams
    ): BatchResponseContentFolder = createFoldersBatch(params, RequestOptions.none())

    /** @see createFoldersBatch */
    fun createFoldersBatch(
        params: LandingPageCreateFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder

    /** @see createFoldersBatch */
    fun createFoldersBatch(
        batchInputContentFolder: BatchInputContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder =
        createFoldersBatch(
            LandingPageCreateFoldersBatchParams.builder()
                .batchInputContentFolder(batchInputContentFolder)
                .build(),
            requestOptions,
        )

    /** @see createFoldersBatch */
    fun createFoldersBatch(
        batchInputContentFolder: BatchInputContentFolder
    ): BatchResponseContentFolder =
        createFoldersBatch(batchInputContentFolder, RequestOptions.none())

    /** Create a new language variation from an existing landing page */
    fun createLanguageVariation(params: LandingPageCreateLanguageVariationParams): Page =
        createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: LandingPageCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        createLanguageVariation(
            LandingPageCreateLanguageVariationParams.builder()
                .contentLanguageCloneRequestVNext(contentLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
    ): Page = createLanguageVariation(contentLanguageCloneRequestVNext, RequestOptions.none())

    /**
     * Delete the Landing Page objects identified in the request body. Note: This is not the same as
     * the dashboard `archive` function. To perform a dashboard `archive` send an normal update with
     * the `archivedInDashboard` field set to true.
     */
    fun deleteBatch(params: LandingPageDeleteBatchParams) =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: LandingPageDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteBatch(
            LandingPageDeleteBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteBatch */
    fun deleteBatch(batchInputString: BatchInputString) =
        deleteBatch(batchInputString, RequestOptions.none())

    /** Delete the Folder object identified by the id in the path. */
    fun deleteFolder(objectId: String) =
        deleteFolder(objectId, LandingPageDeleteFolderParams.none())

    /** @see deleteFolder */
    fun deleteFolder(
        objectId: String,
        params: LandingPageDeleteFolderParams = LandingPageDeleteFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = deleteFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see deleteFolder */
    fun deleteFolder(
        objectId: String,
        params: LandingPageDeleteFolderParams = LandingPageDeleteFolderParams.none(),
    ) = deleteFolder(objectId, params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(
        params: LandingPageDeleteFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteFolder */
    fun deleteFolder(params: LandingPageDeleteFolderParams) =
        deleteFolder(params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(objectId: String, requestOptions: RequestOptions) =
        deleteFolder(objectId, LandingPageDeleteFolderParams.none(), requestOptions)

    /** Delete the Folder objects identified in the request body. */
    fun deleteFoldersBatch(params: LandingPageDeleteFoldersBatchParams) =
        deleteFoldersBatch(params, RequestOptions.none())

    /** @see deleteFoldersBatch */
    fun deleteFoldersBatch(
        params: LandingPageDeleteFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteFoldersBatch */
    fun deleteFoldersBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteFoldersBatch(
            LandingPageDeleteFoldersBatchParams.builder()
                .batchInputString(batchInputString)
                .build(),
            requestOptions,
        )

    /** @see deleteFoldersBatch */
    fun deleteFoldersBatch(batchInputString: BatchInputString) =
        deleteFoldersBatch(batchInputString, RequestOptions.none())

    /** Detach a landing page from a multi-language group. */
    fun detachFromLangGroup(params: LandingPageDetachFromLangGroupParams) =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: LandingPageDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        detachFromLangGroup(
            LandingPageDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext) =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endAbTest(params: LandingPageEndAbTestParams) = endAbTest(params, RequestOptions.none())

    /** @see endAbTest */
    fun endAbTest(
        params: LandingPageEndAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see endAbTest */
    fun endAbTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        endAbTest(
            LandingPageEndAbTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endAbTest */
    fun endAbTest(abTestEndRequestVNext: AbTestEndRequestVNext) =
        endAbTest(abTestEndRequestVNext, RequestOptions.none())

    /** Retrieve the Landing Page object identified by the id in the path. */
    fun get(objectId: String): Page = get(objectId, LandingPageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: LandingPageGetParams = LandingPageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: LandingPageGetParams = LandingPageGetParams.none()): Page =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LandingPageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see get */
    fun get(params: LandingPageGetParams): Page = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): Page =
        get(objectId, LandingPageGetParams.none(), requestOptions)

    /** Retrieve the Landing Page objects identified in the request body. */
    fun getBatch(params: LandingPageGetBatchParams): BatchResponsePage =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: LandingPageGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see getBatch */
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        getBatch(
            LandingPageGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    fun getBatch(batchInputString: BatchInputString): BatchResponsePage =
        getBatch(batchInputString, RequestOptions.none())

    /** Retrieve the full draft version of the Landing Page. */
    fun getDraft(objectId: String): Page = getDraft(objectId, LandingPageGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
    ): Page = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: LandingPageGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see getDraft */
    fun getDraft(params: LandingPageGetDraftParams): Page = getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): Page =
        getDraft(objectId, LandingPageGetDraftParams.none(), requestOptions)

    /** Retrieve the Folder object identified by the id in the path. */
    fun getFolder(objectId: String): ContentFolder =
        getFolder(objectId, LandingPageGetFolderParams.none())

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        params: LandingPageGetFolderParams = LandingPageGetFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder = getFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        params: LandingPageGetFolderParams = LandingPageGetFolderParams.none(),
    ): ContentFolder = getFolder(objectId, params, RequestOptions.none())

    /** @see getFolder */
    fun getFolder(
        params: LandingPageGetFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /** @see getFolder */
    fun getFolder(params: LandingPageGetFolderParams): ContentFolder =
        getFolder(params, RequestOptions.none())

    /** @see getFolder */
    fun getFolder(objectId: String, requestOptions: RequestOptions): ContentFolder =
        getFolder(objectId, LandingPageGetFolderParams.none(), requestOptions)

    /** Retrieves a previous version of a Folder */
    fun getFolderRevision(
        revisionId: String,
        params: LandingPageGetFolderRevisionParams,
    ): VersionContentFolder = getFolderRevision(revisionId, params, RequestOptions.none())

    /** @see getFolderRevision */
    fun getFolderRevision(
        revisionId: String,
        params: LandingPageGetFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionContentFolder =
        getFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getFolderRevision */
    fun getFolderRevision(params: LandingPageGetFolderRevisionParams): VersionContentFolder =
        getFolderRevision(params, RequestOptions.none())

    /** @see getFolderRevision */
    fun getFolderRevision(
        params: LandingPageGetFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionContentFolder

    /** Update the Folder objects identified in the request body. */
    fun getFoldersBatch(params: LandingPageGetFoldersBatchParams): BatchResponseContentFolder =
        getFoldersBatch(params, RequestOptions.none())

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        params: LandingPageGetFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder =
        getFoldersBatch(
            LandingPageGetFoldersBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getFoldersBatch */
    fun getFoldersBatch(batchInputString: BatchInputString): BatchResponseContentFolder =
        getFoldersBatch(batchInputString, RequestOptions.none())

    /** Retrieves a previous version of a Landing Page */
    fun getRevision(revisionId: String, params: LandingPageGetRevisionParams): VersionPage =
        getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: LandingPageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionPage = getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: LandingPageGetRevisionParams): VersionPage =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: LandingPageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionPage

    /** Retrieves all the previous versions of a Folder. */
    fun listFolderRevisions(objectId: String): CollectionResponseWithTotalVersionContentFolder =
        listFolderRevisions(objectId, LandingPageListFolderRevisionsParams.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        params: LandingPageListFolderRevisionsParams = LandingPageListFolderRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalVersionContentFolder =
        listFolderRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        params: LandingPageListFolderRevisionsParams = LandingPageListFolderRevisionsParams.none(),
    ): CollectionResponseWithTotalVersionContentFolder =
        listFolderRevisions(objectId, params, RequestOptions.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        params: LandingPageListFolderRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalVersionContentFolder

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        params: LandingPageListFolderRevisionsParams
    ): CollectionResponseWithTotalVersionContentFolder =
        listFolderRevisions(params, RequestOptions.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalVersionContentFolder =
        listFolderRevisions(objectId, LandingPageListFolderRevisionsParams.none(), requestOptions)

    /**
     * Get the list of Landing Page Folders. Supports paging and filtering. This method would be
     * useful for an integration that examined these models and used an external service to suggest
     * edits.
     */
    fun listFolders(): CollectionResponseWithTotalContentFolderForwardPaging =
        listFolders(LandingPageListFoldersParams.none())

    /** @see listFolders */
    fun listFolders(
        params: LandingPageListFoldersParams = LandingPageListFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalContentFolderForwardPaging

    /** @see listFolders */
    fun listFolders(
        params: LandingPageListFoldersParams = LandingPageListFoldersParams.none()
    ): CollectionResponseWithTotalContentFolderForwardPaging =
        listFolders(params, RequestOptions.none())

    /** @see listFolders */
    fun listFolders(
        requestOptions: RequestOptions
    ): CollectionResponseWithTotalContentFolderForwardPaging =
        listFolders(LandingPageListFoldersParams.none(), requestOptions)

    /** Retrieves all the previous versions of a Landing Page. */
    fun listRevisions(objectId: String): CollectionResponseWithTotalVersionPage =
        listRevisions(objectId, LandingPageListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: LandingPageListRevisionsParams = LandingPageListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalVersionPage =
        listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: LandingPageListRevisionsParams = LandingPageListRevisionsParams.none(),
    ): CollectionResponseWithTotalVersionPage =
        listRevisions(objectId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: LandingPageListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalVersionPage

    /** @see listRevisions */
    fun listRevisions(
        params: LandingPageListRevisionsParams
    ): CollectionResponseWithTotalVersionPage = listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalVersionPage =
        listRevisions(objectId, LandingPageListRevisionsParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the Landing Page and apply them to the live
     * version.
     */
    fun publishDraft(objectId: String) =
        publishDraft(objectId, LandingPagePublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: LandingPagePublishDraftParams = LandingPagePublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: LandingPagePublishDraftParams = LandingPagePublishDraftParams.none(),
    ) = publishDraft(objectId, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: LandingPagePublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see publishDraft */
    fun publishDraft(params: LandingPagePublishDraftParams) =
        publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(objectId: String, requestOptions: RequestOptions) =
        publishDraft(objectId, LandingPagePublishDraftParams.none(), requestOptions)

    /** Rerun a previous A/B test. */
    fun rerunAbTest(params: LandingPageRerunAbTestParams) =
        rerunAbTest(params, RequestOptions.none())

    /** @see rerunAbTest */
    fun rerunAbTest(
        params: LandingPageRerunAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rerunAbTest */
    fun rerunAbTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        rerunAbTest(
            LandingPageRerunAbTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunAbTest */
    fun rerunAbTest(abTestRerunRequestVNext: AbTestRerunRequestVNext) =
        rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())

    /** Discards any edits and resets the draft to the live version. */
    fun resetDraft(objectId: String) = resetDraft(objectId, LandingPageResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
    ) = resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: LandingPageResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resetDraft */
    fun resetDraft(params: LandingPageResetDraftParams) = resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions) =
        resetDraft(objectId, LandingPageResetDraftParams.none(), requestOptions)

    /** Takes a specified version of a Folder and restores it. */
    fun restoreFolderRevision(
        revisionId: String,
        params: LandingPageRestoreFolderRevisionParams,
    ): ContentFolder = restoreFolderRevision(revisionId, params, RequestOptions.none())

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        revisionId: String,
        params: LandingPageRestoreFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder =
        restoreFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(params: LandingPageRestoreFolderRevisionParams): ContentFolder =
        restoreFolderRevision(params, RequestOptions.none())

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        params: LandingPageRestoreFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /** Takes a specified version of a Landing Page and restores it. */
    fun restoreRevision(revisionId: String, params: LandingPageRestoreRevisionParams): Page =
        restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: LandingPageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: LandingPageRestoreRevisionParams): Page =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: LandingPageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /**
     * Takes a specified version of a Landing Page, sets it as the new draft version of the Landing
     * Page.
     */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: LandingPageRestoreRevisionToDraftParams,
    ): Page = restoreRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: LandingPageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        restoreRevisionToDraft(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(params: LandingPageRestoreRevisionToDraftParams): Page =
        restoreRevisionToDraft(params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: LandingPageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** Schedule a Landing Page to be Published */
    fun schedule(params: LandingPageScheduleParams) = schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: LandingPageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        schedule(
            LandingPageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext) =
        schedule(contentScheduleRequestVNext, RequestOptions.none())

    /** Set a landing page as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: LandingPageSetNewLangPrimaryParams) =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: LandingPageSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        setNewLangPrimary(
            LandingPageSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext) =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Update the Landing Page objects identified in the request body. */
    fun updateBatch(params: LandingPageUpdateBatchParams): BatchResponsePage =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: LandingPageUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        updateBatch(
            LandingPageUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): BatchResponsePage =
        updateBatch(batchInputJsonNode, RequestOptions.none())

    /**
     * Sparse updates the draft version of a single Landing Page object identified by the id in the
     * path. You only need to specify the column values that you are modifying.
     */
    fun updateDraft(objectId: String, params: LandingPageUpdateDraftParams): Page =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: LandingPageUpdateDraftParams): Page =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /**
     * Sparse updates a single Folder object identified by the id in the path. You only need to
     * specify the column values that you are modifying.
     */
    fun updateFolder(objectId: String, params: LandingPageUpdateFolderParams): ContentFolder =
        updateFolder(objectId, params, RequestOptions.none())

    /** @see updateFolder */
    fun updateFolder(
        objectId: String,
        params: LandingPageUpdateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder = updateFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateFolder */
    fun updateFolder(params: LandingPageUpdateFolderParams): ContentFolder =
        updateFolder(params, RequestOptions.none())

    /** @see updateFolder */
    fun updateFolder(
        params: LandingPageUpdateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ContentFolder

    /** Update the Folder objects identified in the request body. */
    fun updateFoldersBatch(
        params: LandingPageUpdateFoldersBatchParams
    ): BatchResponseContentFolder = updateFoldersBatch(params, RequestOptions.none())

    /** @see updateFoldersBatch */
    fun updateFoldersBatch(
        params: LandingPageUpdateFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder

    /** @see updateFoldersBatch */
    fun updateFoldersBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseContentFolder =
        updateFoldersBatch(
            LandingPageUpdateFoldersBatchParams.builder()
                .batchInputJsonNode(batchInputJsonNode)
                .build(),
            requestOptions,
        )

    /** @see updateFoldersBatch */
    fun updateFoldersBatch(batchInputJsonNode: BatchInputJsonNode): BatchResponseContentFolder =
        updateFoldersBatch(batchInputJsonNode, RequestOptions.none())

    /** Explicitly set new languages for each landing page in a multi-language group. */
    fun updateLanguages(params: LandingPageUpdateLanguagesParams) =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: LandingPageUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        updateLanguages(
            LandingPageUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLanguages */
    fun updateLanguages(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext) =
        updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())

    /**
     * A view of [LandingPageService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LandingPageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages`, but is otherwise the
         * same as [LandingPageService.create].
         */
        @MustBeClosed
        fun create(params: LandingPageCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: LandingPageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            page: Page,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(LandingPageCreateParams.builder().page(page).build(), requestOptions)

        /** @see create */
        @MustBeClosed fun create(page: Page): HttpResponse = create(page, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/landing-pages/{objectId}`, but is
         * otherwise the same as [LandingPageService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: LandingPageUpdateParams): HttpResponseFor<Page> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: LandingPageUpdateParams): HttpResponseFor<Page> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages`, but is otherwise the
         * same as [LandingPageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<LandingPageListPage> = list(LandingPageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: LandingPageListParams = LandingPageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LandingPageListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: LandingPageListParams = LandingPageListParams.none()
        ): HttpResponseFor<LandingPageListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<LandingPageListPage> =
            list(LandingPageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/pages/landing-pages/{objectId}`, but is
         * otherwise the same as [LandingPageService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse =
            delete(objectId, LandingPageDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: LandingPageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: LandingPageDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, LandingPageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/multi-language/attach-to-lang-group`, but is otherwise the
         * same as [LandingPageService.attachToLangGroup].
         */
        @MustBeClosed
        fun attachToLangGroup(params: LandingPageAttachToLangGroupParams): HttpResponse =
            attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            params: LandingPageAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            attachToLangGroup(
                LandingPageAttachToLangGroupParams.builder()
                    .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
        ): HttpResponse = attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/clone`, but is
         * otherwise the same as [LandingPageService.clone].
         */
        @MustBeClosed
        fun clone(params: LandingPageCloneParams): HttpResponseFor<Page> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: LandingPageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see clone */
        @MustBeClosed
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            clone(
                LandingPageCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponseFor<Page> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/ab-test/create-variation`, but is otherwise the same as
         * [LandingPageService.createAbTestVariation].
         */
        @MustBeClosed
        fun createAbTestVariation(
            params: LandingPageCreateAbTestVariationParams
        ): HttpResponseFor<Page> = createAbTestVariation(params, RequestOptions.none())

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            params: LandingPageCreateAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            createAbTestVariation(
                LandingPageCreateAbTestVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): HttpResponseFor<Page> =
            createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/batch/create`, but is
         * otherwise the same as [LandingPageService.createBatch].
         */
        @MustBeClosed
        fun createBatch(params: LandingPageCreateBatchParams): HttpResponseFor<BatchResponsePage> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            params: LandingPageCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            batchInputPage: BatchInputPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            createBatch(
                LandingPageCreateBatchParams.builder().batchInputPage(batchInputPage).build(),
                requestOptions,
            )

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(batchInputPage: BatchInputPage): HttpResponseFor<BatchResponsePage> =
            createBatch(batchInputPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders`, but is
         * otherwise the same as [LandingPageService.createFolder].
         */
        @MustBeClosed
        fun createFolder(params: LandingPageCreateFolderParams): HttpResponseFor<ContentFolder> =
            createFolder(params, RequestOptions.none())

        /** @see createFolder */
        @MustBeClosed
        fun createFolder(
            params: LandingPageCreateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /** @see createFolder */
        @MustBeClosed
        fun createFolder(
            contentFolder: ContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            createFolder(
                LandingPageCreateFolderParams.builder().contentFolder(contentFolder).build(),
                requestOptions,
            )

        /** @see createFolder */
        @MustBeClosed
        fun createFolder(contentFolder: ContentFolder): HttpResponseFor<ContentFolder> =
            createFolder(contentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders/batch/create`,
         * but is otherwise the same as [LandingPageService.createFoldersBatch].
         */
        @MustBeClosed
        fun createFoldersBatch(
            params: LandingPageCreateFoldersBatchParams
        ): HttpResponseFor<BatchResponseContentFolder> =
            createFoldersBatch(params, RequestOptions.none())

        /** @see createFoldersBatch */
        @MustBeClosed
        fun createFoldersBatch(
            params: LandingPageCreateFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder>

        /** @see createFoldersBatch */
        @MustBeClosed
        fun createFoldersBatch(
            batchInputContentFolder: BatchInputContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder> =
            createFoldersBatch(
                LandingPageCreateFoldersBatchParams.builder()
                    .batchInputContentFolder(batchInputContentFolder)
                    .build(),
                requestOptions,
            )

        /** @see createFoldersBatch */
        @MustBeClosed
        fun createFoldersBatch(
            batchInputContentFolder: BatchInputContentFolder
        ): HttpResponseFor<BatchResponseContentFolder> =
            createFoldersBatch(batchInputContentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/multi-language/create-language-variation`, but is otherwise
         * the same as [LandingPageService.createLanguageVariation].
         */
        @MustBeClosed
        fun createLanguageVariation(
            params: LandingPageCreateLanguageVariationParams
        ): HttpResponseFor<Page> = createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            params: LandingPageCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            createLanguageVariation(
                LandingPageCreateLanguageVariationParams.builder()
                    .contentLanguageCloneRequestVNext(contentLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
        ): HttpResponseFor<Page> =
            createLanguageVariation(contentLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/batch/archive`, but is
         * otherwise the same as [LandingPageService.deleteBatch].
         */
        @MustBeClosed
        fun deleteBatch(params: LandingPageDeleteBatchParams): HttpResponse =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            params: LandingPageDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteBatch(
                LandingPageDeleteBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(batchInputString: BatchInputString): HttpResponse =
            deleteBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete /cms/v3/pages/landing-pages/folders/{objectId}`,
         * but is otherwise the same as [LandingPageService.deleteFolder].
         */
        @MustBeClosed
        fun deleteFolder(objectId: String): HttpResponse =
            deleteFolder(objectId, LandingPageDeleteFolderParams.none())

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(
            objectId: String,
            params: LandingPageDeleteFolderParams = LandingPageDeleteFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(
            objectId: String,
            params: LandingPageDeleteFolderParams = LandingPageDeleteFolderParams.none(),
        ): HttpResponse = deleteFolder(objectId, params, RequestOptions.none())

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(
            params: LandingPageDeleteFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(params: LandingPageDeleteFolderParams): HttpResponse =
            deleteFolder(params, RequestOptions.none())

        /** @see deleteFolder */
        @MustBeClosed
        fun deleteFolder(objectId: String, requestOptions: RequestOptions): HttpResponse =
            deleteFolder(objectId, LandingPageDeleteFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders/batch/archive`,
         * but is otherwise the same as [LandingPageService.deleteFoldersBatch].
         */
        @MustBeClosed
        fun deleteFoldersBatch(params: LandingPageDeleteFoldersBatchParams): HttpResponse =
            deleteFoldersBatch(params, RequestOptions.none())

        /** @see deleteFoldersBatch */
        @MustBeClosed
        fun deleteFoldersBatch(
            params: LandingPageDeleteFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteFoldersBatch */
        @MustBeClosed
        fun deleteFoldersBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteFoldersBatch(
                LandingPageDeleteFoldersBatchParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see deleteFoldersBatch */
        @MustBeClosed
        fun deleteFoldersBatch(batchInputString: BatchInputString): HttpResponse =
            deleteFoldersBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [LandingPageService.detachFromLangGroup].
         */
        @MustBeClosed
        fun detachFromLangGroup(params: LandingPageDetachFromLangGroupParams): HttpResponse =
            detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            params: LandingPageDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            detachFromLangGroup(
                LandingPageDetachFromLangGroupParams.builder()
                    .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
        ): HttpResponse =
            detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/ab-test/end`, but is
         * otherwise the same as [LandingPageService.endAbTest].
         */
        @MustBeClosed
        fun endAbTest(params: LandingPageEndAbTestParams): HttpResponse =
            endAbTest(params, RequestOptions.none())

        /** @see endAbTest */
        @MustBeClosed
        fun endAbTest(
            params: LandingPageEndAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see endAbTest */
        @MustBeClosed
        fun endAbTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            endAbTest(
                LandingPageEndAbTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endAbTest */
        @MustBeClosed
        fun endAbTest(abTestEndRequestVNext: AbTestEndRequestVNext): HttpResponse =
            endAbTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/{objectId}`, but is
         * otherwise the same as [LandingPageService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<Page> =
            get(objectId, LandingPageGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
        ): HttpResponseFor<Page> = get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: LandingPageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see get */
        @MustBeClosed
        fun get(params: LandingPageGetParams): HttpResponseFor<Page> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponseFor<Page> =
            get(objectId, LandingPageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/batch/read`, but is
         * otherwise the same as [LandingPageService.getBatch].
         */
        @MustBeClosed
        fun getBatch(params: LandingPageGetBatchParams): HttpResponseFor<BatchResponsePage> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            params: LandingPageGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            getBatch(
                LandingPageGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(batchInputString: BatchInputString): HttpResponseFor<BatchResponsePage> =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/{objectId}/draft`, but
         * is otherwise the same as [LandingPageService.getDraft].
         */
        @MustBeClosed
        fun getDraft(objectId: String): HttpResponseFor<Page> =
            getDraft(objectId, LandingPageGetDraftParams.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
        ): HttpResponseFor<Page> = getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            params: LandingPageGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(params: LandingPageGetDraftParams): HttpResponseFor<Page> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(objectId: String, requestOptions: RequestOptions): HttpResponseFor<Page> =
            getDraft(objectId, LandingPageGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/folders/{objectId}`, but
         * is otherwise the same as [LandingPageService.getFolder].
         */
        @MustBeClosed
        fun getFolder(objectId: String): HttpResponseFor<ContentFolder> =
            getFolder(objectId, LandingPageGetFolderParams.none())

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(
            objectId: String,
            params: LandingPageGetFolderParams = LandingPageGetFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            getFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(
            objectId: String,
            params: LandingPageGetFolderParams = LandingPageGetFolderParams.none(),
        ): HttpResponseFor<ContentFolder> = getFolder(objectId, params, RequestOptions.none())

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(
            params: LandingPageGetFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(params: LandingPageGetFolderParams): HttpResponseFor<ContentFolder> =
            getFolder(params, RequestOptions.none())

        /** @see getFolder */
        @MustBeClosed
        fun getFolder(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ContentFolder> =
            getFolder(objectId, LandingPageGetFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/pages/landing-pages/folders/{objectId}/revisions/{revisionId}`, but is otherwise
         * the same as [LandingPageService.getFolderRevision].
         */
        @MustBeClosed
        fun getFolderRevision(
            revisionId: String,
            params: LandingPageGetFolderRevisionParams,
        ): HttpResponseFor<VersionContentFolder> =
            getFolderRevision(revisionId, params, RequestOptions.none())

        /** @see getFolderRevision */
        @MustBeClosed
        fun getFolderRevision(
            revisionId: String,
            params: LandingPageGetFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionContentFolder> =
            getFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getFolderRevision */
        @MustBeClosed
        fun getFolderRevision(
            params: LandingPageGetFolderRevisionParams
        ): HttpResponseFor<VersionContentFolder> = getFolderRevision(params, RequestOptions.none())

        /** @see getFolderRevision */
        @MustBeClosed
        fun getFolderRevision(
            params: LandingPageGetFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionContentFolder>

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders/batch/read`,
         * but is otherwise the same as [LandingPageService.getFoldersBatch].
         */
        @MustBeClosed
        fun getFoldersBatch(
            params: LandingPageGetFoldersBatchParams
        ): HttpResponseFor<BatchResponseContentFolder> =
            getFoldersBatch(params, RequestOptions.none())

        /** @see getFoldersBatch */
        @MustBeClosed
        fun getFoldersBatch(
            params: LandingPageGetFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder>

        /** @see getFoldersBatch */
        @MustBeClosed
        fun getFoldersBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder> =
            getFoldersBatch(
                LandingPageGetFoldersBatchParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see getFoldersBatch */
        @MustBeClosed
        fun getFoldersBatch(
            batchInputString: BatchInputString
        ): HttpResponseFor<BatchResponseContentFolder> =
            getFoldersBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/pages/landing-pages/{objectId}/revisions/{revisionId}`, but is otherwise the same
         * as [LandingPageService.getRevision].
         */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: LandingPageGetRevisionParams,
        ): HttpResponseFor<VersionPage> = getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: LandingPageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionPage> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(params: LandingPageGetRevisionParams): HttpResponseFor<VersionPage> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            params: LandingPageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionPage>

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/pages/landing-pages/folders/{objectId}/revisions`, but is otherwise the same as
         * [LandingPageService.listFolderRevisions].
         */
        @MustBeClosed
        fun listFolderRevisions(
            objectId: String
        ): HttpResponseFor<CollectionResponseWithTotalVersionContentFolder> =
            listFolderRevisions(objectId, LandingPageListFolderRevisionsParams.none())

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            objectId: String,
            params: LandingPageListFolderRevisionsParams =
                LandingPageListFolderRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalVersionContentFolder> =
            listFolderRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            objectId: String,
            params: LandingPageListFolderRevisionsParams =
                LandingPageListFolderRevisionsParams.none(),
        ): HttpResponseFor<CollectionResponseWithTotalVersionContentFolder> =
            listFolderRevisions(objectId, params, RequestOptions.none())

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            params: LandingPageListFolderRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalVersionContentFolder>

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            params: LandingPageListFolderRevisionsParams
        ): HttpResponseFor<CollectionResponseWithTotalVersionContentFolder> =
            listFolderRevisions(params, RequestOptions.none())

        /** @see listFolderRevisions */
        @MustBeClosed
        fun listFolderRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalVersionContentFolder> =
            listFolderRevisions(
                objectId,
                LandingPageListFolderRevisionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/folders`, but is
         * otherwise the same as [LandingPageService.listFolders].
         */
        @MustBeClosed
        fun listFolders(): HttpResponseFor<CollectionResponseWithTotalContentFolderForwardPaging> =
            listFolders(LandingPageListFoldersParams.none())

        /** @see listFolders */
        @MustBeClosed
        fun listFolders(
            params: LandingPageListFoldersParams = LandingPageListFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalContentFolderForwardPaging>

        /** @see listFolders */
        @MustBeClosed
        fun listFolders(
            params: LandingPageListFoldersParams = LandingPageListFoldersParams.none()
        ): HttpResponseFor<CollectionResponseWithTotalContentFolderForwardPaging> =
            listFolders(params, RequestOptions.none())

        /** @see listFolders */
        @MustBeClosed
        fun listFolders(
            requestOptions: RequestOptions
        ): HttpResponseFor<CollectionResponseWithTotalContentFolderForwardPaging> =
            listFolders(LandingPageListFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/{objectId}/revisions`,
         * but is otherwise the same as [LandingPageService.listRevisions].
         */
        @MustBeClosed
        fun listRevisions(
            objectId: String
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(objectId, LandingPageListRevisionsParams.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            params: LandingPageListRevisionsParams = LandingPageListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            params: LandingPageListRevisionsParams = LandingPageListRevisionsParams.none(),
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(objectId, params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: LandingPageListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage>

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: LandingPageListRevisionsParams
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(objectId, LandingPageListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/{objectId}/draft/push-live`, but is otherwise the same as
         * [LandingPageService.publishDraft].
         */
        @MustBeClosed
        fun publishDraft(objectId: String): HttpResponse =
            publishDraft(objectId, LandingPagePublishDraftParams.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            objectId: String,
            params: LandingPagePublishDraftParams = LandingPagePublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            objectId: String,
            params: LandingPagePublishDraftParams = LandingPagePublishDraftParams.none(),
        ): HttpResponse = publishDraft(objectId, params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            params: LandingPagePublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(params: LandingPagePublishDraftParams): HttpResponse =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            publishDraft(objectId, LandingPagePublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/ab-test/rerun`, but is
         * otherwise the same as [LandingPageService.rerunAbTest].
         */
        @MustBeClosed
        fun rerunAbTest(params: LandingPageRerunAbTestParams): HttpResponse =
            rerunAbTest(params, RequestOptions.none())

        /** @see rerunAbTest */
        @MustBeClosed
        fun rerunAbTest(
            params: LandingPageRerunAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rerunAbTest */
        @MustBeClosed
        fun rerunAbTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            rerunAbTest(
                LandingPageRerunAbTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunAbTest */
        @MustBeClosed
        fun rerunAbTest(abTestRerunRequestVNext: AbTestRerunRequestVNext): HttpResponse =
            rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [LandingPageService.resetDraft].
         */
        @MustBeClosed
        fun resetDraft(objectId: String): HttpResponse =
            resetDraft(objectId, LandingPageResetDraftParams.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
        ): HttpResponse = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            params: LandingPageResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(params: LandingPageResetDraftParams): HttpResponse =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            resetDraft(objectId, LandingPageResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/folders/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [LandingPageService.restoreFolderRevision].
         */
        @MustBeClosed
        fun restoreFolderRevision(
            revisionId: String,
            params: LandingPageRestoreFolderRevisionParams,
        ): HttpResponseFor<ContentFolder> =
            restoreFolderRevision(revisionId, params, RequestOptions.none())

        /** @see restoreFolderRevision */
        @MustBeClosed
        fun restoreFolderRevision(
            revisionId: String,
            params: LandingPageRestoreFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            restoreFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreFolderRevision */
        @MustBeClosed
        fun restoreFolderRevision(
            params: LandingPageRestoreFolderRevisionParams
        ): HttpResponseFor<ContentFolder> = restoreFolderRevision(params, RequestOptions.none())

        /** @see restoreFolderRevision */
        @MustBeClosed
        fun restoreFolderRevision(
            params: LandingPageRestoreFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/{objectId}/revisions/{revisionId}/restore`, but is otherwise
         * the same as [LandingPageService.restoreRevision].
         */
        @MustBeClosed
        fun restoreRevision(
            revisionId: String,
            params: LandingPageRestoreRevisionParams,
        ): HttpResponseFor<Page> = restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            revisionId: String,
            params: LandingPageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(params: LandingPageRestoreRevisionParams): HttpResponseFor<Page> =
            restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            params: LandingPageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [LandingPageService.restoreRevisionToDraft].
         */
        @MustBeClosed
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: LandingPageRestoreRevisionToDraftParams,
        ): HttpResponseFor<Page> = restoreRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: LandingPageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            params: LandingPageRestoreRevisionToDraftParams
        ): HttpResponseFor<Page> = restoreRevisionToDraft(params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            params: LandingPageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/schedule`, but is
         * otherwise the same as [LandingPageService.schedule].
         */
        @MustBeClosed
        fun schedule(params: LandingPageScheduleParams): HttpResponse =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: LandingPageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            schedule(
                LandingPageScheduleParams.builder()
                    .contentScheduleRequestVNext(contentScheduleRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see schedule */
        @MustBeClosed
        fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext): HttpResponse =
            schedule(contentScheduleRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/pages/landing-pages/multi-language/set-new-lang-primary`, but is otherwise the
         * same as [LandingPageService.setNewLangPrimary].
         */
        @MustBeClosed
        fun setNewLangPrimary(params: LandingPageSetNewLangPrimaryParams): HttpResponse =
            setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            params: LandingPageSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            setNewLangPrimary(
                LandingPageSetNewLangPrimaryParams.builder()
                    .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ): HttpResponse =
            setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/batch/update`, but is
         * otherwise the same as [LandingPageService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(params: LandingPageUpdateBatchParams): HttpResponseFor<BatchResponsePage> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: LandingPageUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            updateBatch(
                LandingPageUpdateBatchParams.builder()
                    .batchInputJsonNode(batchInputJsonNode)
                    .build(),
                requestOptions,
            )

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode
        ): HttpResponseFor<BatchResponsePage> =
            updateBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/landing-pages/{objectId}/draft`, but
         * is otherwise the same as [LandingPageService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: LandingPageUpdateDraftParams,
        ): HttpResponseFor<Page> = updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: LandingPageUpdateDraftParams): HttpResponseFor<Page> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/landing-pages/folders/{objectId}`,
         * but is otherwise the same as [LandingPageService.updateFolder].
         */
        @MustBeClosed
        fun updateFolder(
            objectId: String,
            params: LandingPageUpdateFolderParams,
        ): HttpResponseFor<ContentFolder> = updateFolder(objectId, params, RequestOptions.none())

        /** @see updateFolder */
        @MustBeClosed
        fun updateFolder(
            objectId: String,
            params: LandingPageUpdateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder> =
            updateFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateFolder */
        @MustBeClosed
        fun updateFolder(params: LandingPageUpdateFolderParams): HttpResponseFor<ContentFolder> =
            updateFolder(params, RequestOptions.none())

        /** @see updateFolder */
        @MustBeClosed
        fun updateFolder(
            params: LandingPageUpdateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ContentFolder>

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders/batch/update`,
         * but is otherwise the same as [LandingPageService.updateFoldersBatch].
         */
        @MustBeClosed
        fun updateFoldersBatch(
            params: LandingPageUpdateFoldersBatchParams
        ): HttpResponseFor<BatchResponseContentFolder> =
            updateFoldersBatch(params, RequestOptions.none())

        /** @see updateFoldersBatch */
        @MustBeClosed
        fun updateFoldersBatch(
            params: LandingPageUpdateFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder>

        /** @see updateFoldersBatch */
        @MustBeClosed
        fun updateFoldersBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseContentFolder> =
            updateFoldersBatch(
                LandingPageUpdateFoldersBatchParams.builder()
                    .batchInputJsonNode(batchInputJsonNode)
                    .build(),
                requestOptions,
            )

        /** @see updateFoldersBatch */
        @MustBeClosed
        fun updateFoldersBatch(
            batchInputJsonNode: BatchInputJsonNode
        ): HttpResponseFor<BatchResponseContentFolder> =
            updateFoldersBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/multi-language/update-languages`, but is otherwise the same
         * as [LandingPageService.updateLanguages].
         */
        @MustBeClosed
        fun updateLanguages(params: LandingPageUpdateLanguagesParams): HttpResponse =
            updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            params: LandingPageUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLanguages(
                LandingPageUpdateLanguagesParams.builder()
                    .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
        ): HttpResponse = updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())
    }
}
