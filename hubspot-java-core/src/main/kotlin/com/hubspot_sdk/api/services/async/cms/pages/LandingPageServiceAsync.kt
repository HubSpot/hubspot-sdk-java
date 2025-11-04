// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

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
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListFolderRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListFolderRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListFoldersPageAsync
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListFoldersParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListPageAsync
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListParams
import com.hubspot_sdk.api.models.cms.pages.landingpages.LandingPageListRevisionsPageAsync
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
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LandingPageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LandingPageServiceAsync

    /** Create a new Landing Page */
    fun create(params: LandingPageCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: LandingPageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(
        page: Page,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        create(LandingPageCreateParams.builder().page(page).build(), requestOptions)

    /** @see create */
    fun create(page: Page): CompletableFuture<Void?> = create(page, RequestOptions.none())

    /**
     * Sparse updates a single Landing Page object identified by the id in the path. You only need
     * to specify the column values that you are modifying.
     */
    fun update(objectId: String, params: LandingPageUpdateParams): CompletableFuture<Page> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: LandingPageUpdateParams): CompletableFuture<Page> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: LandingPageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * Get the list of landing pages. Supports paging and filtering. This method would be useful for
     * an integration that examined these models and used an external service to suggest edits.
     */
    fun list(): CompletableFuture<LandingPageListPageAsync> = list(LandingPageListParams.none())

    /** @see list */
    fun list(
        params: LandingPageListParams = LandingPageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LandingPageListPageAsync>

    /** @see list */
    fun list(
        params: LandingPageListParams = LandingPageListParams.none()
    ): CompletableFuture<LandingPageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<LandingPageListPageAsync> =
        list(LandingPageListParams.none(), requestOptions)

    /** Delete the Landing Page object identified by the id in the path. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, LandingPageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: LandingPageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: LandingPageDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, LandingPageDeleteParams.none(), requestOptions)

    /** Attach a landing page to a multi-language group. */
    fun attachToLangGroup(params: LandingPageAttachToLangGroupParams): CompletableFuture<Void?> =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: LandingPageAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        attachToLangGroup(
            LandingPageAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<Void?> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Clone a Landing Page */
    fun clone(params: LandingPageCloneParams): CompletableFuture<Page> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: LandingPageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        clone(
            LandingPageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CompletableFuture<Page> =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createAbTestVariation(
        params: LandingPageCreateAbTestVariationParams
    ): CompletableFuture<Page> = createAbTestVariation(params, RequestOptions.none())

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        params: LandingPageCreateAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        createAbTestVariation(
            LandingPageCreateAbTestVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext
    ): CompletableFuture<Page> =
        createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** Create the Landing Page objects detailed in the request body. */
    fun createBatch(params: LandingPageCreateBatchParams): CompletableFuture<BatchResponsePage> =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: LandingPageCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see createBatch */
    fun createBatch(
        batchInputPage: BatchInputPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        createBatch(
            LandingPageCreateBatchParams.builder().batchInputPage(batchInputPage).build(),
            requestOptions,
        )

    /** @see createBatch */
    fun createBatch(batchInputPage: BatchInputPage): CompletableFuture<BatchResponsePage> =
        createBatch(batchInputPage, RequestOptions.none())

    /** Create a new Folder */
    fun createFolder(params: LandingPageCreateFolderParams): CompletableFuture<ContentFolder> =
        createFolder(params, RequestOptions.none())

    /** @see createFolder */
    fun createFolder(
        params: LandingPageCreateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /** @see createFolder */
    fun createFolder(
        contentFolder: ContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        createFolder(
            LandingPageCreateFolderParams.builder().contentFolder(contentFolder).build(),
            requestOptions,
        )

    /** @see createFolder */
    fun createFolder(contentFolder: ContentFolder): CompletableFuture<ContentFolder> =
        createFolder(contentFolder, RequestOptions.none())

    /** Create the Folder objects detailed in the request body. */
    fun createFoldersBatch(
        params: LandingPageCreateFoldersBatchParams
    ): CompletableFuture<BatchResponseContentFolder> =
        createFoldersBatch(params, RequestOptions.none())

    /** @see createFoldersBatch */
    fun createFoldersBatch(
        params: LandingPageCreateFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder>

    /** @see createFoldersBatch */
    fun createFoldersBatch(
        batchInputContentFolder: BatchInputContentFolder,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder> =
        createFoldersBatch(
            LandingPageCreateFoldersBatchParams.builder()
                .batchInputContentFolder(batchInputContentFolder)
                .build(),
            requestOptions,
        )

    /** @see createFoldersBatch */
    fun createFoldersBatch(
        batchInputContentFolder: BatchInputContentFolder
    ): CompletableFuture<BatchResponseContentFolder> =
        createFoldersBatch(batchInputContentFolder, RequestOptions.none())

    /** Create a new language variation from an existing landing page */
    fun createLanguageVariation(
        params: LandingPageCreateLanguageVariationParams
    ): CompletableFuture<Page> = createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: LandingPageCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        createLanguageVariation(
            LandingPageCreateLanguageVariationParams.builder()
                .contentLanguageCloneRequestVNext(contentLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
    ): CompletableFuture<Page> =
        createLanguageVariation(contentLanguageCloneRequestVNext, RequestOptions.none())

    /**
     * Delete the Landing Page objects identified in the request body. Note: This is not the same as
     * the dashboard `archive` function. To perform a dashboard `archive` send an normal update with
     * the `archivedInDashboard` field set to true.
     */
    fun deleteBatch(params: LandingPageDeleteBatchParams): CompletableFuture<Void?> =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: LandingPageDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteBatch(
            LandingPageDeleteBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteBatch */
    fun deleteBatch(batchInputString: BatchInputString): CompletableFuture<Void?> =
        deleteBatch(batchInputString, RequestOptions.none())

    /** Delete the Folder object identified by the id in the path. */
    fun deleteFolder(objectId: String): CompletableFuture<Void?> =
        deleteFolder(objectId, LandingPageDeleteFolderParams.none())

    /** @see deleteFolder */
    fun deleteFolder(
        objectId: String,
        params: LandingPageDeleteFolderParams = LandingPageDeleteFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see deleteFolder */
    fun deleteFolder(
        objectId: String,
        params: LandingPageDeleteFolderParams = LandingPageDeleteFolderParams.none(),
    ): CompletableFuture<Void?> = deleteFolder(objectId, params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(
        params: LandingPageDeleteFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteFolder */
    fun deleteFolder(params: LandingPageDeleteFolderParams): CompletableFuture<Void?> =
        deleteFolder(params, RequestOptions.none())

    /** @see deleteFolder */
    fun deleteFolder(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        deleteFolder(objectId, LandingPageDeleteFolderParams.none(), requestOptions)

    /** Delete the Folder objects identified in the request body. */
    fun deleteFoldersBatch(params: LandingPageDeleteFoldersBatchParams): CompletableFuture<Void?> =
        deleteFoldersBatch(params, RequestOptions.none())

    /** @see deleteFoldersBatch */
    fun deleteFoldersBatch(
        params: LandingPageDeleteFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteFoldersBatch */
    fun deleteFoldersBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteFoldersBatch(
            LandingPageDeleteFoldersBatchParams.builder()
                .batchInputString(batchInputString)
                .build(),
            requestOptions,
        )

    /** @see deleteFoldersBatch */
    fun deleteFoldersBatch(batchInputString: BatchInputString): CompletableFuture<Void?> =
        deleteFoldersBatch(batchInputString, RequestOptions.none())

    /** Detach a landing page from a multi-language group. */
    fun detachFromLangGroup(
        params: LandingPageDetachFromLangGroupParams
    ): CompletableFuture<Void?> = detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: LandingPageDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        detachFromLangGroup(
            LandingPageDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<Void?> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endAbTest(params: LandingPageEndAbTestParams): CompletableFuture<Void?> =
        endAbTest(params, RequestOptions.none())

    /** @see endAbTest */
    fun endAbTest(
        params: LandingPageEndAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see endAbTest */
    fun endAbTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        endAbTest(
            LandingPageEndAbTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endAbTest */
    fun endAbTest(abTestEndRequestVNext: AbTestEndRequestVNext): CompletableFuture<Void?> =
        endAbTest(abTestEndRequestVNext, RequestOptions.none())

    /** Retrieve the Landing Page object identified by the id in the path. */
    fun get(objectId: String): CompletableFuture<Page> = get(objectId, LandingPageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: LandingPageGetParams = LandingPageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: LandingPageGetParams = LandingPageGetParams.none(),
    ): CompletableFuture<Page> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: LandingPageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see get */
    fun get(params: LandingPageGetParams): CompletableFuture<Page> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<Page> =
        get(objectId, LandingPageGetParams.none(), requestOptions)

    /** Retrieve the Landing Page objects identified in the request body. */
    fun getBatch(params: LandingPageGetBatchParams): CompletableFuture<BatchResponsePage> =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: LandingPageGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see getBatch */
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        getBatch(
            LandingPageGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    fun getBatch(batchInputString: BatchInputString): CompletableFuture<BatchResponsePage> =
        getBatch(batchInputString, RequestOptions.none())

    /** Retrieve the full draft version of the Landing Page. */
    fun getDraft(objectId: String): CompletableFuture<Page> =
        getDraft(objectId, LandingPageGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
    ): CompletableFuture<Page> = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: LandingPageGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see getDraft */
    fun getDraft(params: LandingPageGetDraftParams): CompletableFuture<Page> =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Page> =
        getDraft(objectId, LandingPageGetDraftParams.none(), requestOptions)

    /** Retrieve the Folder object identified by the id in the path. */
    fun getFolder(objectId: String): CompletableFuture<ContentFolder> =
        getFolder(objectId, LandingPageGetFolderParams.none())

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        params: LandingPageGetFolderParams = LandingPageGetFolderParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        getFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        params: LandingPageGetFolderParams = LandingPageGetFolderParams.none(),
    ): CompletableFuture<ContentFolder> = getFolder(objectId, params, RequestOptions.none())

    /** @see getFolder */
    fun getFolder(
        params: LandingPageGetFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /** @see getFolder */
    fun getFolder(params: LandingPageGetFolderParams): CompletableFuture<ContentFolder> =
        getFolder(params, RequestOptions.none())

    /** @see getFolder */
    fun getFolder(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ContentFolder> =
        getFolder(objectId, LandingPageGetFolderParams.none(), requestOptions)

    /** Retrieves a previous version of a Folder */
    fun getFolderRevision(
        revisionId: String,
        params: LandingPageGetFolderRevisionParams,
    ): CompletableFuture<VersionContentFolder> =
        getFolderRevision(revisionId, params, RequestOptions.none())

    /** @see getFolderRevision */
    fun getFolderRevision(
        revisionId: String,
        params: LandingPageGetFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionContentFolder> =
        getFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getFolderRevision */
    fun getFolderRevision(
        params: LandingPageGetFolderRevisionParams
    ): CompletableFuture<VersionContentFolder> = getFolderRevision(params, RequestOptions.none())

    /** @see getFolderRevision */
    fun getFolderRevision(
        params: LandingPageGetFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionContentFolder>

    /** Update the Folder objects identified in the request body. */
    fun getFoldersBatch(
        params: LandingPageGetFoldersBatchParams
    ): CompletableFuture<BatchResponseContentFolder> =
        getFoldersBatch(params, RequestOptions.none())

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        params: LandingPageGetFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder>

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder> =
        getFoldersBatch(
            LandingPageGetFoldersBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getFoldersBatch */
    fun getFoldersBatch(
        batchInputString: BatchInputString
    ): CompletableFuture<BatchResponseContentFolder> =
        getFoldersBatch(batchInputString, RequestOptions.none())

    /** Retrieves a previous version of a Landing Page */
    fun getRevision(
        revisionId: String,
        params: LandingPageGetRevisionParams,
    ): CompletableFuture<VersionPage> = getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: LandingPageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionPage> =
        getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: LandingPageGetRevisionParams): CompletableFuture<VersionPage> =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: LandingPageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionPage>

    /** Retrieves all the previous versions of a Folder. */
    fun listFolderRevisions(
        objectId: String
    ): CompletableFuture<LandingPageListFolderRevisionsPageAsync> =
        listFolderRevisions(objectId, LandingPageListFolderRevisionsParams.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        params: LandingPageListFolderRevisionsParams = LandingPageListFolderRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LandingPageListFolderRevisionsPageAsync> =
        listFolderRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        params: LandingPageListFolderRevisionsParams = LandingPageListFolderRevisionsParams.none(),
    ): CompletableFuture<LandingPageListFolderRevisionsPageAsync> =
        listFolderRevisions(objectId, params, RequestOptions.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        params: LandingPageListFolderRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LandingPageListFolderRevisionsPageAsync>

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        params: LandingPageListFolderRevisionsParams
    ): CompletableFuture<LandingPageListFolderRevisionsPageAsync> =
        listFolderRevisions(params, RequestOptions.none())

    /** @see listFolderRevisions */
    fun listFolderRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LandingPageListFolderRevisionsPageAsync> =
        listFolderRevisions(objectId, LandingPageListFolderRevisionsParams.none(), requestOptions)

    /**
     * Get the list of Landing Page Folders. Supports paging and filtering. This method would be
     * useful for an integration that examined these models and used an external service to suggest
     * edits.
     */
    fun listFolders(): CompletableFuture<LandingPageListFoldersPageAsync> =
        listFolders(LandingPageListFoldersParams.none())

    /** @see listFolders */
    fun listFolders(
        params: LandingPageListFoldersParams = LandingPageListFoldersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LandingPageListFoldersPageAsync>

    /** @see listFolders */
    fun listFolders(
        params: LandingPageListFoldersParams = LandingPageListFoldersParams.none()
    ): CompletableFuture<LandingPageListFoldersPageAsync> =
        listFolders(params, RequestOptions.none())

    /** @see listFolders */
    fun listFolders(
        requestOptions: RequestOptions
    ): CompletableFuture<LandingPageListFoldersPageAsync> =
        listFolders(LandingPageListFoldersParams.none(), requestOptions)

    /** Retrieves all the previous versions of a Landing Page. */
    fun listRevisions(objectId: String): CompletableFuture<LandingPageListRevisionsPageAsync> =
        listRevisions(objectId, LandingPageListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: LandingPageListRevisionsParams = LandingPageListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LandingPageListRevisionsPageAsync> =
        listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: LandingPageListRevisionsParams = LandingPageListRevisionsParams.none(),
    ): CompletableFuture<LandingPageListRevisionsPageAsync> =
        listRevisions(objectId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: LandingPageListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LandingPageListRevisionsPageAsync>

    /** @see listRevisions */
    fun listRevisions(
        params: LandingPageListRevisionsParams
    ): CompletableFuture<LandingPageListRevisionsPageAsync> =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LandingPageListRevisionsPageAsync> =
        listRevisions(objectId, LandingPageListRevisionsParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the Landing Page and apply them to the live
     * version.
     */
    fun publishDraft(objectId: String): CompletableFuture<Void?> =
        publishDraft(objectId, LandingPagePublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: LandingPagePublishDraftParams = LandingPagePublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: LandingPagePublishDraftParams = LandingPagePublishDraftParams.none(),
    ): CompletableFuture<Void?> = publishDraft(objectId, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: LandingPagePublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see publishDraft */
    fun publishDraft(params: LandingPagePublishDraftParams): CompletableFuture<Void?> =
        publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        publishDraft(objectId, LandingPagePublishDraftParams.none(), requestOptions)

    /** Rerun a previous A/B test. */
    fun rerunAbTest(params: LandingPageRerunAbTestParams): CompletableFuture<Void?> =
        rerunAbTest(params, RequestOptions.none())

    /** @see rerunAbTest */
    fun rerunAbTest(
        params: LandingPageRerunAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see rerunAbTest */
    fun rerunAbTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        rerunAbTest(
            LandingPageRerunAbTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunAbTest */
    fun rerunAbTest(abTestRerunRequestVNext: AbTestRerunRequestVNext): CompletableFuture<Void?> =
        rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())

    /** Discards any edits and resets the draft to the live version. */
    fun resetDraft(objectId: String): CompletableFuture<Void?> =
        resetDraft(objectId, LandingPageResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
    ): CompletableFuture<Void?> = resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: LandingPageResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resetDraft */
    fun resetDraft(params: LandingPageResetDraftParams): CompletableFuture<Void?> =
        resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        resetDraft(objectId, LandingPageResetDraftParams.none(), requestOptions)

    /** Takes a specified version of a Folder and restores it. */
    fun restoreFolderRevision(
        revisionId: String,
        params: LandingPageRestoreFolderRevisionParams,
    ): CompletableFuture<ContentFolder> =
        restoreFolderRevision(revisionId, params, RequestOptions.none())

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        revisionId: String,
        params: LandingPageRestoreFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        restoreFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        params: LandingPageRestoreFolderRevisionParams
    ): CompletableFuture<ContentFolder> = restoreFolderRevision(params, RequestOptions.none())

    /** @see restoreFolderRevision */
    fun restoreFolderRevision(
        params: LandingPageRestoreFolderRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /** Takes a specified version of a Landing Page and restores it. */
    fun restoreRevision(
        revisionId: String,
        params: LandingPageRestoreRevisionParams,
    ): CompletableFuture<Page> = restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: LandingPageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: LandingPageRestoreRevisionParams): CompletableFuture<Page> =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: LandingPageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * Takes a specified version of a Landing Page, sets it as the new draft version of the Landing
     * Page.
     */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: LandingPageRestoreRevisionToDraftParams,
    ): CompletableFuture<Page> = restoreRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: LandingPageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        restoreRevisionToDraft(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: LandingPageRestoreRevisionToDraftParams
    ): CompletableFuture<Page> = restoreRevisionToDraft(params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: LandingPageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** Schedule a Landing Page to be Published */
    fun schedule(params: LandingPageScheduleParams): CompletableFuture<Void?> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: LandingPageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        schedule(
            LandingPageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext
    ): CompletableFuture<Void?> = schedule(contentScheduleRequestVNext, RequestOptions.none())

    /** Set a landing page as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: LandingPageSetNewLangPrimaryParams): CompletableFuture<Void?> =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: LandingPageSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        setNewLangPrimary(
            LandingPageSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
    ): CompletableFuture<Void?> =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Update the Landing Page objects identified in the request body. */
    fun updateBatch(params: LandingPageUpdateBatchParams): CompletableFuture<BatchResponsePage> =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: LandingPageUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        updateBatch(
            LandingPageUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): CompletableFuture<BatchResponsePage> =
        updateBatch(batchInputJsonNode, RequestOptions.none())

    /**
     * Sparse updates the draft version of a single Landing Page object identified by the id in the
     * path. You only need to specify the column values that you are modifying.
     */
    fun updateDraft(
        objectId: String,
        params: LandingPageUpdateDraftParams,
    ): CompletableFuture<Page> = updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: LandingPageUpdateDraftParams): CompletableFuture<Page> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: LandingPageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * Sparse updates a single Folder object identified by the id in the path. You only need to
     * specify the column values that you are modifying.
     */
    fun updateFolder(
        objectId: String,
        params: LandingPageUpdateFolderParams,
    ): CompletableFuture<ContentFolder> = updateFolder(objectId, params, RequestOptions.none())

    /** @see updateFolder */
    fun updateFolder(
        objectId: String,
        params: LandingPageUpdateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder> =
        updateFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateFolder */
    fun updateFolder(params: LandingPageUpdateFolderParams): CompletableFuture<ContentFolder> =
        updateFolder(params, RequestOptions.none())

    /** @see updateFolder */
    fun updateFolder(
        params: LandingPageUpdateFolderParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ContentFolder>

    /** Update the Folder objects identified in the request body. */
    fun updateFoldersBatch(
        params: LandingPageUpdateFoldersBatchParams
    ): CompletableFuture<BatchResponseContentFolder> =
        updateFoldersBatch(params, RequestOptions.none())

    /** @see updateFoldersBatch */
    fun updateFoldersBatch(
        params: LandingPageUpdateFoldersBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder>

    /** @see updateFoldersBatch */
    fun updateFoldersBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseContentFolder> =
        updateFoldersBatch(
            LandingPageUpdateFoldersBatchParams.builder()
                .batchInputJsonNode(batchInputJsonNode)
                .build(),
            requestOptions,
        )

    /** @see updateFoldersBatch */
    fun updateFoldersBatch(
        batchInputJsonNode: BatchInputJsonNode
    ): CompletableFuture<BatchResponseContentFolder> =
        updateFoldersBatch(batchInputJsonNode, RequestOptions.none())

    /** Explicitly set new languages for each landing page in a multi-language group. */
    fun updateLanguages(params: LandingPageUpdateLanguagesParams): CompletableFuture<Void?> =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: LandingPageUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateLanguages(
            LandingPageUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
    ): CompletableFuture<Void?> =
        updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())

    /**
     * A view of [LandingPageServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LandingPageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages`, but is otherwise the
         * same as [LandingPageServiceAsync.create].
         */
        fun create(params: LandingPageCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: LandingPageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            page: Page,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(LandingPageCreateParams.builder().page(page).build(), requestOptions)

        /** @see create */
        fun create(page: Page): CompletableFuture<HttpResponse> =
            create(page, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/landing-pages/{objectId}`, but is
         * otherwise the same as [LandingPageServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: LandingPageUpdateParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: LandingPageUpdateParams): CompletableFuture<HttpResponseFor<Page>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: LandingPageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages`, but is otherwise the
         * same as [LandingPageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<LandingPageListPageAsync>> =
            list(LandingPageListParams.none())

        /** @see list */
        fun list(
            params: LandingPageListParams = LandingPageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LandingPageListPageAsync>>

        /** @see list */
        fun list(
            params: LandingPageListParams = LandingPageListParams.none()
        ): CompletableFuture<HttpResponseFor<LandingPageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LandingPageListPageAsync>> =
            list(LandingPageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/pages/landing-pages/{objectId}`, but is
         * otherwise the same as [LandingPageServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, LandingPageDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: LandingPageDeleteParams = LandingPageDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: LandingPageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: LandingPageDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, LandingPageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/multi-language/attach-to-lang-group`, but is otherwise the
         * same as [LandingPageServiceAsync.attachToLangGroup].
         */
        fun attachToLangGroup(
            params: LandingPageAttachToLangGroupParams
        ): CompletableFuture<HttpResponse> = attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            params: LandingPageAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(
                LandingPageAttachToLangGroupParams.builder()
                    .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/clone`, but is
         * otherwise the same as [LandingPageServiceAsync.clone].
         */
        fun clone(params: LandingPageCloneParams): CompletableFuture<HttpResponseFor<Page>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: LandingPageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            clone(
                LandingPageCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<Page>> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/ab-test/create-variation`, but is otherwise the same as
         * [LandingPageServiceAsync.createAbTestVariation].
         */
        fun createAbTestVariation(
            params: LandingPageCreateAbTestVariationParams
        ): CompletableFuture<HttpResponseFor<Page>> =
            createAbTestVariation(params, RequestOptions.none())

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            params: LandingPageCreateAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            createAbTestVariation(
                LandingPageCreateAbTestVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): CompletableFuture<HttpResponseFor<Page>> =
            createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/batch/create`, but is
         * otherwise the same as [LandingPageServiceAsync.createBatch].
         */
        fun createBatch(
            params: LandingPageCreateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            params: LandingPageCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see createBatch */
        fun createBatch(
            batchInputPage: BatchInputPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createBatch(
                LandingPageCreateBatchParams.builder().batchInputPage(batchInputPage).build(),
                requestOptions,
            )

        /** @see createBatch */
        fun createBatch(
            batchInputPage: BatchInputPage
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createBatch(batchInputPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders`, but is
         * otherwise the same as [LandingPageServiceAsync.createFolder].
         */
        fun createFolder(
            params: LandingPageCreateFolderParams
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            createFolder(params, RequestOptions.none())

        /** @see createFolder */
        fun createFolder(
            params: LandingPageCreateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /** @see createFolder */
        fun createFolder(
            contentFolder: ContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            createFolder(
                LandingPageCreateFolderParams.builder().contentFolder(contentFolder).build(),
                requestOptions,
            )

        /** @see createFolder */
        fun createFolder(
            contentFolder: ContentFolder
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            createFolder(contentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders/batch/create`,
         * but is otherwise the same as [LandingPageServiceAsync.createFoldersBatch].
         */
        fun createFoldersBatch(
            params: LandingPageCreateFoldersBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            createFoldersBatch(params, RequestOptions.none())

        /** @see createFoldersBatch */
        fun createFoldersBatch(
            params: LandingPageCreateFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>>

        /** @see createFoldersBatch */
        fun createFoldersBatch(
            batchInputContentFolder: BatchInputContentFolder,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            createFoldersBatch(
                LandingPageCreateFoldersBatchParams.builder()
                    .batchInputContentFolder(batchInputContentFolder)
                    .build(),
                requestOptions,
            )

        /** @see createFoldersBatch */
        fun createFoldersBatch(
            batchInputContentFolder: BatchInputContentFolder
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            createFoldersBatch(batchInputContentFolder, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/multi-language/create-language-variation`, but is otherwise
         * the same as [LandingPageServiceAsync.createLanguageVariation].
         */
        fun createLanguageVariation(
            params: LandingPageCreateLanguageVariationParams
        ): CompletableFuture<HttpResponseFor<Page>> =
            createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            params: LandingPageCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            createLanguageVariation(
                LandingPageCreateLanguageVariationParams.builder()
                    .contentLanguageCloneRequestVNext(contentLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<Page>> =
            createLanguageVariation(contentLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/batch/archive`, but is
         * otherwise the same as [LandingPageServiceAsync.deleteBatch].
         */
        fun deleteBatch(params: LandingPageDeleteBatchParams): CompletableFuture<HttpResponse> =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        fun deleteBatch(
            params: LandingPageDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteBatch */
        fun deleteBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteBatch(
                LandingPageDeleteBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteBatch */
        fun deleteBatch(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
            deleteBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `delete /cms/v3/pages/landing-pages/folders/{objectId}`,
         * but is otherwise the same as [LandingPageServiceAsync.deleteFolder].
         */
        fun deleteFolder(objectId: String): CompletableFuture<HttpResponse> =
            deleteFolder(objectId, LandingPageDeleteFolderParams.none())

        /** @see deleteFolder */
        fun deleteFolder(
            objectId: String,
            params: LandingPageDeleteFolderParams = LandingPageDeleteFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see deleteFolder */
        fun deleteFolder(
            objectId: String,
            params: LandingPageDeleteFolderParams = LandingPageDeleteFolderParams.none(),
        ): CompletableFuture<HttpResponse> = deleteFolder(objectId, params, RequestOptions.none())

        /** @see deleteFolder */
        fun deleteFolder(
            params: LandingPageDeleteFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteFolder */
        fun deleteFolder(params: LandingPageDeleteFolderParams): CompletableFuture<HttpResponse> =
            deleteFolder(params, RequestOptions.none())

        /** @see deleteFolder */
        fun deleteFolder(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            deleteFolder(objectId, LandingPageDeleteFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders/batch/archive`,
         * but is otherwise the same as [LandingPageServiceAsync.deleteFoldersBatch].
         */
        fun deleteFoldersBatch(
            params: LandingPageDeleteFoldersBatchParams
        ): CompletableFuture<HttpResponse> = deleteFoldersBatch(params, RequestOptions.none())

        /** @see deleteFoldersBatch */
        fun deleteFoldersBatch(
            params: LandingPageDeleteFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteFoldersBatch */
        fun deleteFoldersBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteFoldersBatch(
                LandingPageDeleteFoldersBatchParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see deleteFoldersBatch */
        fun deleteFoldersBatch(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponse> =
            deleteFoldersBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [LandingPageServiceAsync.detachFromLangGroup].
         */
        fun detachFromLangGroup(
            params: LandingPageDetachFromLangGroupParams
        ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            params: LandingPageDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(
                LandingPageDetachFromLangGroupParams.builder()
                    .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/ab-test/end`, but is
         * otherwise the same as [LandingPageServiceAsync.endAbTest].
         */
        fun endAbTest(params: LandingPageEndAbTestParams): CompletableFuture<HttpResponse> =
            endAbTest(params, RequestOptions.none())

        /** @see endAbTest */
        fun endAbTest(
            params: LandingPageEndAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see endAbTest */
        fun endAbTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            endAbTest(
                LandingPageEndAbTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endAbTest */
        fun endAbTest(
            abTestEndRequestVNext: AbTestEndRequestVNext
        ): CompletableFuture<HttpResponse> = endAbTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/{objectId}`, but is
         * otherwise the same as [LandingPageServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<Page>> =
            get(objectId, LandingPageGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: LandingPageGetParams = LandingPageGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Page>> = get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: LandingPageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see get */
        fun get(params: LandingPageGetParams): CompletableFuture<HttpResponseFor<Page>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> =
            get(objectId, LandingPageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/batch/read`, but is
         * otherwise the same as [LandingPageServiceAsync.getBatch].
         */
        fun getBatch(
            params: LandingPageGetBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        fun getBatch(
            params: LandingPageGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see getBatch */
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getBatch(
                LandingPageGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        fun getBatch(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/{objectId}/draft`, but
         * is otherwise the same as [LandingPageServiceAsync.getDraft].
         */
        fun getDraft(objectId: String): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, LandingPageGetDraftParams.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: LandingPageGetDraftParams = LandingPageGetDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            params: LandingPageGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see getDraft */
        fun getDraft(params: LandingPageGetDraftParams): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, LandingPageGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/folders/{objectId}`, but
         * is otherwise the same as [LandingPageServiceAsync.getFolder].
         */
        fun getFolder(objectId: String): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(objectId, LandingPageGetFolderParams.none())

        /** @see getFolder */
        fun getFolder(
            objectId: String,
            params: LandingPageGetFolderParams = LandingPageGetFolderParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getFolder */
        fun getFolder(
            objectId: String,
            params: LandingPageGetFolderParams = LandingPageGetFolderParams.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(objectId, params, RequestOptions.none())

        /** @see getFolder */
        fun getFolder(
            params: LandingPageGetFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /** @see getFolder */
        fun getFolder(
            params: LandingPageGetFolderParams
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(params, RequestOptions.none())

        /** @see getFolder */
        fun getFolder(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            getFolder(objectId, LandingPageGetFolderParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/pages/landing-pages/folders/{objectId}/revisions/{revisionId}`, but is otherwise
         * the same as [LandingPageServiceAsync.getFolderRevision].
         */
        fun getFolderRevision(
            revisionId: String,
            params: LandingPageGetFolderRevisionParams,
        ): CompletableFuture<HttpResponseFor<VersionContentFolder>> =
            getFolderRevision(revisionId, params, RequestOptions.none())

        /** @see getFolderRevision */
        fun getFolderRevision(
            revisionId: String,
            params: LandingPageGetFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionContentFolder>> =
            getFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getFolderRevision */
        fun getFolderRevision(
            params: LandingPageGetFolderRevisionParams
        ): CompletableFuture<HttpResponseFor<VersionContentFolder>> =
            getFolderRevision(params, RequestOptions.none())

        /** @see getFolderRevision */
        fun getFolderRevision(
            params: LandingPageGetFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionContentFolder>>

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders/batch/read`,
         * but is otherwise the same as [LandingPageServiceAsync.getFoldersBatch].
         */
        fun getFoldersBatch(
            params: LandingPageGetFoldersBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            getFoldersBatch(params, RequestOptions.none())

        /** @see getFoldersBatch */
        fun getFoldersBatch(
            params: LandingPageGetFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>>

        /** @see getFoldersBatch */
        fun getFoldersBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            getFoldersBatch(
                LandingPageGetFoldersBatchParams.builder()
                    .batchInputString(batchInputString)
                    .build(),
                requestOptions,
            )

        /** @see getFoldersBatch */
        fun getFoldersBatch(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            getFoldersBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/pages/landing-pages/{objectId}/revisions/{revisionId}`, but is otherwise the same
         * as [LandingPageServiceAsync.getRevision].
         */
        fun getRevision(
            revisionId: String,
            params: LandingPageGetRevisionParams,
        ): CompletableFuture<HttpResponseFor<VersionPage>> =
            getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            revisionId: String,
            params: LandingPageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionPage>> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        fun getRevision(
            params: LandingPageGetRevisionParams
        ): CompletableFuture<HttpResponseFor<VersionPage>> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            params: LandingPageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionPage>>

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/pages/landing-pages/folders/{objectId}/revisions`, but is otherwise the same as
         * [LandingPageServiceAsync.listFolderRevisions].
         */
        fun listFolderRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<LandingPageListFolderRevisionsPageAsync>> =
            listFolderRevisions(objectId, LandingPageListFolderRevisionsParams.none())

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            objectId: String,
            params: LandingPageListFolderRevisionsParams =
                LandingPageListFolderRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LandingPageListFolderRevisionsPageAsync>> =
            listFolderRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            objectId: String,
            params: LandingPageListFolderRevisionsParams =
                LandingPageListFolderRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<LandingPageListFolderRevisionsPageAsync>> =
            listFolderRevisions(objectId, params, RequestOptions.none())

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            params: LandingPageListFolderRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LandingPageListFolderRevisionsPageAsync>>

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            params: LandingPageListFolderRevisionsParams
        ): CompletableFuture<HttpResponseFor<LandingPageListFolderRevisionsPageAsync>> =
            listFolderRevisions(params, RequestOptions.none())

        /** @see listFolderRevisions */
        fun listFolderRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LandingPageListFolderRevisionsPageAsync>> =
            listFolderRevisions(
                objectId,
                LandingPageListFolderRevisionsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/folders`, but is
         * otherwise the same as [LandingPageServiceAsync.listFolders].
         */
        fun listFolders(): CompletableFuture<HttpResponseFor<LandingPageListFoldersPageAsync>> =
            listFolders(LandingPageListFoldersParams.none())

        /** @see listFolders */
        fun listFolders(
            params: LandingPageListFoldersParams = LandingPageListFoldersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LandingPageListFoldersPageAsync>>

        /** @see listFolders */
        fun listFolders(
            params: LandingPageListFoldersParams = LandingPageListFoldersParams.none()
        ): CompletableFuture<HttpResponseFor<LandingPageListFoldersPageAsync>> =
            listFolders(params, RequestOptions.none())

        /** @see listFolders */
        fun listFolders(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<LandingPageListFoldersPageAsync>> =
            listFolders(LandingPageListFoldersParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/landing-pages/{objectId}/revisions`,
         * but is otherwise the same as [LandingPageServiceAsync.listRevisions].
         */
        fun listRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<LandingPageListRevisionsPageAsync>> =
            listRevisions(objectId, LandingPageListRevisionsParams.none())

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            params: LandingPageListRevisionsParams = LandingPageListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LandingPageListRevisionsPageAsync>> =
            listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            params: LandingPageListRevisionsParams = LandingPageListRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<LandingPageListRevisionsPageAsync>> =
            listRevisions(objectId, params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            params: LandingPageListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LandingPageListRevisionsPageAsync>>

        /** @see listRevisions */
        fun listRevisions(
            params: LandingPageListRevisionsParams
        ): CompletableFuture<HttpResponseFor<LandingPageListRevisionsPageAsync>> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LandingPageListRevisionsPageAsync>> =
            listRevisions(objectId, LandingPageListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/{objectId}/draft/push-live`, but is otherwise the same as
         * [LandingPageServiceAsync.publishDraft].
         */
        fun publishDraft(objectId: String): CompletableFuture<HttpResponse> =
            publishDraft(objectId, LandingPagePublishDraftParams.none())

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            params: LandingPagePublishDraftParams = LandingPagePublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            params: LandingPagePublishDraftParams = LandingPagePublishDraftParams.none(),
        ): CompletableFuture<HttpResponse> = publishDraft(objectId, params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            params: LandingPagePublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see publishDraft */
        fun publishDraft(params: LandingPagePublishDraftParams): CompletableFuture<HttpResponse> =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            publishDraft(objectId, LandingPagePublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/ab-test/rerun`, but is
         * otherwise the same as [LandingPageServiceAsync.rerunAbTest].
         */
        fun rerunAbTest(params: LandingPageRerunAbTestParams): CompletableFuture<HttpResponse> =
            rerunAbTest(params, RequestOptions.none())

        /** @see rerunAbTest */
        fun rerunAbTest(
            params: LandingPageRerunAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see rerunAbTest */
        fun rerunAbTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rerunAbTest(
                LandingPageRerunAbTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunAbTest */
        fun rerunAbTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext
        ): CompletableFuture<HttpResponse> =
            rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/{objectId}/draft/reset`, but is otherwise the same as
         * [LandingPageServiceAsync.resetDraft].
         */
        fun resetDraft(objectId: String): CompletableFuture<HttpResponse> =
            resetDraft(objectId, LandingPageResetDraftParams.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: LandingPageResetDraftParams = LandingPageResetDraftParams.none(),
        ): CompletableFuture<HttpResponse> = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            params: LandingPageResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resetDraft */
        fun resetDraft(params: LandingPageResetDraftParams): CompletableFuture<HttpResponse> =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resetDraft(objectId, LandingPageResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/folders/{objectId}/revisions/{revisionId}/restore`, but is
         * otherwise the same as [LandingPageServiceAsync.restoreFolderRevision].
         */
        fun restoreFolderRevision(
            revisionId: String,
            params: LandingPageRestoreFolderRevisionParams,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            restoreFolderRevision(revisionId, params, RequestOptions.none())

        /** @see restoreFolderRevision */
        fun restoreFolderRevision(
            revisionId: String,
            params: LandingPageRestoreFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            restoreFolderRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreFolderRevision */
        fun restoreFolderRevision(
            params: LandingPageRestoreFolderRevisionParams
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            restoreFolderRevision(params, RequestOptions.none())

        /** @see restoreFolderRevision */
        fun restoreFolderRevision(
            params: LandingPageRestoreFolderRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/{objectId}/revisions/{revisionId}/restore`, but is otherwise
         * the same as [LandingPageServiceAsync.restoreRevision].
         */
        fun restoreRevision(
            revisionId: String,
            params: LandingPageRestoreRevisionParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            revisionId: String,
            params: LandingPageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        fun restoreRevision(
            params: LandingPageRestoreRevisionParams
        ): CompletableFuture<HttpResponseFor<Page>> = restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            params: LandingPageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [LandingPageServiceAsync.restoreRevisionToDraft].
         */
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: LandingPageRestoreRevisionToDraftParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: LandingPageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            params: LandingPageRestoreRevisionToDraftParams
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevisionToDraft(params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            params: LandingPageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/schedule`, but is
         * otherwise the same as [LandingPageServiceAsync.schedule].
         */
        fun schedule(params: LandingPageScheduleParams): CompletableFuture<HttpResponse> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            params: LandingPageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            schedule(
                LandingPageScheduleParams.builder()
                    .contentScheduleRequestVNext(contentScheduleRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext
        ): CompletableFuture<HttpResponse> =
            schedule(contentScheduleRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/pages/landing-pages/multi-language/set-new-lang-primary`, but is otherwise the
         * same as [LandingPageServiceAsync.setNewLangPrimary].
         */
        fun setNewLangPrimary(
            params: LandingPageSetNewLangPrimaryParams
        ): CompletableFuture<HttpResponse> = setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            params: LandingPageSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            setNewLangPrimary(
                LandingPageSetNewLangPrimaryParams.builder()
                    .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ): CompletableFuture<HttpResponse> =
            setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/batch/update`, but is
         * otherwise the same as [LandingPageServiceAsync.updateBatch].
         */
        fun updateBatch(
            params: LandingPageUpdateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: LandingPageUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see updateBatch */
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateBatch(
                LandingPageUpdateBatchParams.builder()
                    .batchInputJsonNode(batchInputJsonNode)
                    .build(),
                requestOptions,
            )

        /** @see updateBatch */
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/landing-pages/{objectId}/draft`, but
         * is otherwise the same as [LandingPageServiceAsync.updateDraft].
         */
        fun updateDraft(
            objectId: String,
            params: LandingPageUpdateDraftParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            objectId: String,
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(
            params: LandingPageUpdateDraftParams
        ): CompletableFuture<HttpResponseFor<Page>> = updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: LandingPageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/landing-pages/folders/{objectId}`,
         * but is otherwise the same as [LandingPageServiceAsync.updateFolder].
         */
        fun updateFolder(
            objectId: String,
            params: LandingPageUpdateFolderParams,
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            updateFolder(objectId, params, RequestOptions.none())

        /** @see updateFolder */
        fun updateFolder(
            objectId: String,
            params: LandingPageUpdateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            updateFolder(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateFolder */
        fun updateFolder(
            params: LandingPageUpdateFolderParams
        ): CompletableFuture<HttpResponseFor<ContentFolder>> =
            updateFolder(params, RequestOptions.none())

        /** @see updateFolder */
        fun updateFolder(
            params: LandingPageUpdateFolderParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ContentFolder>>

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/landing-pages/folders/batch/update`,
         * but is otherwise the same as [LandingPageServiceAsync.updateFoldersBatch].
         */
        fun updateFoldersBatch(
            params: LandingPageUpdateFoldersBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            updateFoldersBatch(params, RequestOptions.none())

        /** @see updateFoldersBatch */
        fun updateFoldersBatch(
            params: LandingPageUpdateFoldersBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>>

        /** @see updateFoldersBatch */
        fun updateFoldersBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            updateFoldersBatch(
                LandingPageUpdateFoldersBatchParams.builder()
                    .batchInputJsonNode(batchInputJsonNode)
                    .build(),
                requestOptions,
            )

        /** @see updateFoldersBatch */
        fun updateFoldersBatch(
            batchInputJsonNode: BatchInputJsonNode
        ): CompletableFuture<HttpResponseFor<BatchResponseContentFolder>> =
            updateFoldersBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/landing-pages/multi-language/update-languages`, but is otherwise the same
         * as [LandingPageServiceAsync.updateLanguages].
         */
        fun updateLanguages(
            params: LandingPageUpdateLanguagesParams
        ): CompletableFuture<HttpResponse> = updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        fun updateLanguages(
            params: LandingPageUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateLanguages */
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLanguages(
                LandingPageUpdateLanguagesParams.builder()
                    .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see updateLanguages */
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
        ): CompletableFuture<HttpResponse> =
            updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())
    }
}
