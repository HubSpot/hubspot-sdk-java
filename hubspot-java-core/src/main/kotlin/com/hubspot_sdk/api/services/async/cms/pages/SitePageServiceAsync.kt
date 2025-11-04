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
import com.hubspot_sdk.api.models.cms.pages.BatchInputPage
import com.hubspot_sdk.api.models.cms.pages.BatchResponsePage
import com.hubspot_sdk.api.models.cms.pages.ContentLanguageCloneRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.VersionPage
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCloneParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCreateAbTestVariationParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCreateBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageCreateParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageDeleteBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageEndAbTestParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageGetRevisionParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageListPageAsync
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageListParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageListRevisionsPageAsync
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageListRevisionsParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePagePublishDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageRerunAbTestParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageResetDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageRestoreRevisionParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageRestoreRevisionToDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateBatchParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SitePageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SitePageServiceAsync

    /** Create a new Site Page */
    fun create(params: SitePageCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: SitePageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see create */
    fun create(
        page: Page,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        create(SitePageCreateParams.builder().page(page).build(), requestOptions)

    /** @see create */
    fun create(page: Page): CompletableFuture<Void?> = create(page, RequestOptions.none())

    /**
     * Sparse updates a single Site Page object identified by the id in the path. You only need to
     * specify the column values that you are modifying.
     */
    fun update(objectId: String, params: SitePageUpdateParams): CompletableFuture<Page> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: SitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: SitePageUpdateParams): CompletableFuture<Page> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * Get the list of site pages. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    fun list(): CompletableFuture<SitePageListPageAsync> = list(SitePageListParams.none())

    /** @see list */
    fun list(
        params: SitePageListParams = SitePageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SitePageListPageAsync>

    /** @see list */
    fun list(
        params: SitePageListParams = SitePageListParams.none()
    ): CompletableFuture<SitePageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SitePageListPageAsync> =
        list(SitePageListParams.none(), requestOptions)

    /** Delete the Site Page object identified by the id in the path. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, SitePageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: SitePageDeleteParams = SitePageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: SitePageDeleteParams = SitePageDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: SitePageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: SitePageDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, SitePageDeleteParams.none(), requestOptions)

    /** Attach a site page to a multi-language group. */
    fun attachToLangGroup(params: SitePageAttachToLangGroupParams): CompletableFuture<Void?> =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: SitePageAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        attachToLangGroup(
            SitePageAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<Void?> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Clone a Site Page */
    fun clone(params: SitePageCloneParams): CompletableFuture<Page> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: SitePageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        clone(
            SitePageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CompletableFuture<Page> =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createAbTestVariation(
        params: SitePageCreateAbTestVariationParams
    ): CompletableFuture<Page> = createAbTestVariation(params, RequestOptions.none())

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        params: SitePageCreateAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        createAbTestVariation(
            SitePageCreateAbTestVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext
    ): CompletableFuture<Page> =
        createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** Create the Site Page objects detailed in the request body. */
    fun createBatch(params: SitePageCreateBatchParams): CompletableFuture<BatchResponsePage> =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: SitePageCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see createBatch */
    fun createBatch(
        batchInputPage: BatchInputPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        createBatch(
            SitePageCreateBatchParams.builder().batchInputPage(batchInputPage).build(),
            requestOptions,
        )

    /** @see createBatch */
    fun createBatch(batchInputPage: BatchInputPage): CompletableFuture<BatchResponsePage> =
        createBatch(batchInputPage, RequestOptions.none())

    /** Create a new language variation from an existing site page */
    fun createLanguageVariation(
        params: SitePageCreateLanguageVariationParams
    ): CompletableFuture<Page> = createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: SitePageCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        createLanguageVariation(
            SitePageCreateLanguageVariationParams.builder()
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
     * Delete the Site Page objects identified in the request body. Note: This is not the same as
     * the dashboard `archive` function. To perform a dashboard `archive` send an normal update with
     * the `archivedInDashboard` field set to true.
     */
    fun deleteBatch(params: SitePageDeleteBatchParams): CompletableFuture<Void?> =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: SitePageDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteBatch(
            SitePageDeleteBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteBatch */
    fun deleteBatch(batchInputString: BatchInputString): CompletableFuture<Void?> =
        deleteBatch(batchInputString, RequestOptions.none())

    /** Detach a site page from a multi-language group. */
    fun detachFromLangGroup(params: SitePageDetachFromLangGroupParams): CompletableFuture<Void?> =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: SitePageDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        detachFromLangGroup(
            SitePageDetachFromLangGroupParams.builder()
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
    fun endAbTest(params: SitePageEndAbTestParams): CompletableFuture<Void?> =
        endAbTest(params, RequestOptions.none())

    /** @see endAbTest */
    fun endAbTest(
        params: SitePageEndAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see endAbTest */
    fun endAbTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        endAbTest(
            SitePageEndAbTestParams.builder().abTestEndRequestVNext(abTestEndRequestVNext).build(),
            requestOptions,
        )

    /** @see endAbTest */
    fun endAbTest(abTestEndRequestVNext: AbTestEndRequestVNext): CompletableFuture<Void?> =
        endAbTest(abTestEndRequestVNext, RequestOptions.none())

    /** Retrieve the Site Page object identified by the id in the path. */
    fun get(objectId: String): CompletableFuture<Page> = get(objectId, SitePageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: SitePageGetParams = SitePageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: SitePageGetParams = SitePageGetParams.none(),
    ): CompletableFuture<Page> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SitePageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see get */
    fun get(params: SitePageGetParams): CompletableFuture<Page> = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<Page> =
        get(objectId, SitePageGetParams.none(), requestOptions)

    /** Retrieve the Site Page objects identified in the request body. */
    fun getBatch(params: SitePageGetBatchParams): CompletableFuture<BatchResponsePage> =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: SitePageGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see getBatch */
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        getBatch(
            SitePageGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    fun getBatch(batchInputString: BatchInputString): CompletableFuture<BatchResponsePage> =
        getBatch(batchInputString, RequestOptions.none())

    /** Retrieve the full draft version of the Site Page. */
    fun getDraft(objectId: String): CompletableFuture<Page> =
        getDraft(objectId, SitePageGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: SitePageGetDraftParams = SitePageGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: SitePageGetDraftParams = SitePageGetDraftParams.none(),
    ): CompletableFuture<Page> = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: SitePageGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see getDraft */
    fun getDraft(params: SitePageGetDraftParams): CompletableFuture<Page> =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Page> =
        getDraft(objectId, SitePageGetDraftParams.none(), requestOptions)

    /** Retrieves a previous version of a Site Page */
    fun getRevision(
        revisionId: String,
        params: SitePageGetRevisionParams,
    ): CompletableFuture<VersionPage> = getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: SitePageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionPage> =
        getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: SitePageGetRevisionParams): CompletableFuture<VersionPage> =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: SitePageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionPage>

    /** Retrieves all the previous versions of a Site Page. */
    fun listRevisions(objectId: String): CompletableFuture<SitePageListRevisionsPageAsync> =
        listRevisions(objectId, SitePageListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: SitePageListRevisionsParams = SitePageListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SitePageListRevisionsPageAsync> =
        listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: SitePageListRevisionsParams = SitePageListRevisionsParams.none(),
    ): CompletableFuture<SitePageListRevisionsPageAsync> =
        listRevisions(objectId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: SitePageListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SitePageListRevisionsPageAsync>

    /** @see listRevisions */
    fun listRevisions(
        params: SitePageListRevisionsParams
    ): CompletableFuture<SitePageListRevisionsPageAsync> =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<SitePageListRevisionsPageAsync> =
        listRevisions(objectId, SitePageListRevisionsParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the Site Page and apply them to the live version.
     */
    fun publishDraft(objectId: String): CompletableFuture<Void?> =
        publishDraft(objectId, SitePagePublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: SitePagePublishDraftParams = SitePagePublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: SitePagePublishDraftParams = SitePagePublishDraftParams.none(),
    ): CompletableFuture<Void?> = publishDraft(objectId, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: SitePagePublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see publishDraft */
    fun publishDraft(params: SitePagePublishDraftParams): CompletableFuture<Void?> =
        publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        publishDraft(objectId, SitePagePublishDraftParams.none(), requestOptions)

    /** Rerun a previous A/B test. */
    fun rerunAbTest(params: SitePageRerunAbTestParams): CompletableFuture<Void?> =
        rerunAbTest(params, RequestOptions.none())

    /** @see rerunAbTest */
    fun rerunAbTest(
        params: SitePageRerunAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see rerunAbTest */
    fun rerunAbTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        rerunAbTest(
            SitePageRerunAbTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunAbTest */
    fun rerunAbTest(abTestRerunRequestVNext: AbTestRerunRequestVNext): CompletableFuture<Void?> =
        rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())

    /** Discards any edits and resets the draft to the live version. */
    fun resetDraft(objectId: String): CompletableFuture<Void?> =
        resetDraft(objectId, SitePageResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: SitePageResetDraftParams = SitePageResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: SitePageResetDraftParams = SitePageResetDraftParams.none(),
    ): CompletableFuture<Void?> = resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: SitePageResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resetDraft */
    fun resetDraft(params: SitePageResetDraftParams): CompletableFuture<Void?> =
        resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        resetDraft(objectId, SitePageResetDraftParams.none(), requestOptions)

    /** Takes a specified version of a Site Page and restores it. */
    fun restoreRevision(
        revisionId: String,
        params: SitePageRestoreRevisionParams,
    ): CompletableFuture<Page> = restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: SitePageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: SitePageRestoreRevisionParams): CompletableFuture<Page> =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: SitePageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * Takes a specified version of a Site Page, sets it as the new draft version of the Site Page.
     */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: SitePageRestoreRevisionToDraftParams,
    ): CompletableFuture<Page> = restoreRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: SitePageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        restoreRevisionToDraft(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: SitePageRestoreRevisionToDraftParams
    ): CompletableFuture<Page> = restoreRevisionToDraft(params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: SitePageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** Schedule a Site Page to be Published */
    fun schedule(params: SitePageScheduleParams): CompletableFuture<Void?> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: SitePageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        schedule(
            SitePageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext
    ): CompletableFuture<Void?> = schedule(contentScheduleRequestVNext, RequestOptions.none())

    /** Set a site page as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: SitePageSetNewLangPrimaryParams): CompletableFuture<Void?> =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: SitePageSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        setNewLangPrimary(
            SitePageSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
    ): CompletableFuture<Void?> =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Update the Site Page objects identified in the request body. */
    fun updateBatch(params: SitePageUpdateBatchParams): CompletableFuture<BatchResponsePage> =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: SitePageUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage>

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponsePage> =
        updateBatch(
            SitePageUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): CompletableFuture<BatchResponsePage> =
        updateBatch(batchInputJsonNode, RequestOptions.none())

    /**
     * Sparse updates the draft version of a single Site Page object identified by the id in the
     * path. You only need to specify the column values that you are modifying.
     */
    fun updateDraft(objectId: String, params: SitePageUpdateDraftParams): CompletableFuture<Page> =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: SitePageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: SitePageUpdateDraftParams): CompletableFuture<Page> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: SitePageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** Explicitly set new languages for each site page in a multi-language group. */
    fun updateLanguages(params: SitePageUpdateLanguagesParams): CompletableFuture<Void?> =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: SitePageUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateLanguages(
            SitePageUpdateLanguagesParams.builder()
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
     * A view of [SitePageServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SitePageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages`, but is otherwise the
         * same as [SitePageServiceAsync.create].
         */
        fun create(params: SitePageCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: SitePageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            page: Page,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(SitePageCreateParams.builder().page(page).build(), requestOptions)

        /** @see create */
        fun create(page: Page): CompletableFuture<HttpResponse> =
            create(page, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: SitePageUpdateParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: SitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: SitePageUpdateParams): CompletableFuture<HttpResponseFor<Page>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: SitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/site-pages`, but is otherwise the same
         * as [SitePageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SitePageListPageAsync>> =
            list(SitePageListParams.none())

        /** @see list */
        fun list(
            params: SitePageListParams = SitePageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SitePageListPageAsync>>

        /** @see list */
        fun list(
            params: SitePageListParams = SitePageListParams.none()
        ): CompletableFuture<HttpResponseFor<SitePageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SitePageListPageAsync>> =
            list(SitePageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/pages/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, SitePageDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: SitePageDeleteParams = SitePageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: SitePageDeleteParams = SitePageDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: SitePageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: SitePageDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, SitePageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/multi-language/attach-to-lang-group`, but is otherwise the same
         * as [SitePageServiceAsync.attachToLangGroup].
         */
        fun attachToLangGroup(
            params: SitePageAttachToLangGroupParams
        ): CompletableFuture<HttpResponse> = attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            params: SitePageAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(
                SitePageAttachToLangGroupParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/clone`, but is otherwise
         * the same as [SitePageServiceAsync.clone].
         */
        fun clone(params: SitePageCloneParams): CompletableFuture<HttpResponseFor<Page>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: SitePageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            clone(
                SitePageCloneParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/ab-test/create-variation`,
         * but is otherwise the same as [SitePageServiceAsync.createAbTestVariation].
         */
        fun createAbTestVariation(
            params: SitePageCreateAbTestVariationParams
        ): CompletableFuture<HttpResponseFor<Page>> =
            createAbTestVariation(params, RequestOptions.none())

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            params: SitePageCreateAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see createAbTestVariation */
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            createAbTestVariation(
                SitePageCreateAbTestVariationParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/batch/create`, but is
         * otherwise the same as [SitePageServiceAsync.createBatch].
         */
        fun createBatch(
            params: SitePageCreateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            params: SitePageCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see createBatch */
        fun createBatch(
            batchInputPage: BatchInputPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createBatch(
                SitePageCreateBatchParams.builder().batchInputPage(batchInputPage).build(),
                requestOptions,
            )

        /** @see createBatch */
        fun createBatch(
            batchInputPage: BatchInputPage
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            createBatch(batchInputPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/multi-language/create-language-variation`, but is otherwise the
         * same as [SitePageServiceAsync.createLanguageVariation].
         */
        fun createLanguageVariation(
            params: SitePageCreateLanguageVariationParams
        ): CompletableFuture<HttpResponseFor<Page>> =
            createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            params: SitePageCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            createLanguageVariation(
                SitePageCreateLanguageVariationParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/batch/archive`, but is
         * otherwise the same as [SitePageServiceAsync.deleteBatch].
         */
        fun deleteBatch(params: SitePageDeleteBatchParams): CompletableFuture<HttpResponse> =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        fun deleteBatch(
            params: SitePageDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteBatch */
        fun deleteBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteBatch(
                SitePageDeleteBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteBatch */
        fun deleteBatch(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
            deleteBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [SitePageServiceAsync.detachFromLangGroup].
         */
        fun detachFromLangGroup(
            params: SitePageDetachFromLangGroupParams
        ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            params: SitePageDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(
                SitePageDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/ab-test/end`, but is
         * otherwise the same as [SitePageServiceAsync.endAbTest].
         */
        fun endAbTest(params: SitePageEndAbTestParams): CompletableFuture<HttpResponse> =
            endAbTest(params, RequestOptions.none())

        /** @see endAbTest */
        fun endAbTest(
            params: SitePageEndAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see endAbTest */
        fun endAbTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            endAbTest(
                SitePageEndAbTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endAbTest */
        fun endAbTest(
            abTestEndRequestVNext: AbTestEndRequestVNext
        ): CompletableFuture<HttpResponse> = endAbTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<Page>> =
            get(objectId, SitePageGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: SitePageGetParams = SitePageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: SitePageGetParams = SitePageGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Page>> = get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SitePageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see get */
        fun get(params: SitePageGetParams): CompletableFuture<HttpResponseFor<Page>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> =
            get(objectId, SitePageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/batch/read`, but is
         * otherwise the same as [SitePageServiceAsync.getBatch].
         */
        fun getBatch(
            params: SitePageGetBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        fun getBatch(
            params: SitePageGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see getBatch */
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getBatch(
                SitePageGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        fun getBatch(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/site-pages/{objectId}/draft`, but is
         * otherwise the same as [SitePageServiceAsync.getDraft].
         */
        fun getDraft(objectId: String): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, SitePageGetDraftParams.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: SitePageGetDraftParams = SitePageGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: SitePageGetDraftParams = SitePageGetDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            params: SitePageGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see getDraft */
        fun getDraft(params: SitePageGetDraftParams): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, SitePageGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/pages/site-pages/{objectId}/revisions/{revisionId}`, but is otherwise the same as
         * [SitePageServiceAsync.getRevision].
         */
        fun getRevision(
            revisionId: String,
            params: SitePageGetRevisionParams,
        ): CompletableFuture<HttpResponseFor<VersionPage>> =
            getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            revisionId: String,
            params: SitePageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionPage>> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        fun getRevision(
            params: SitePageGetRevisionParams
        ): CompletableFuture<HttpResponseFor<VersionPage>> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            params: SitePageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionPage>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/site-pages/{objectId}/revisions`, but
         * is otherwise the same as [SitePageServiceAsync.listRevisions].
         */
        fun listRevisions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<SitePageListRevisionsPageAsync>> =
            listRevisions(objectId, SitePageListRevisionsParams.none())

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            params: SitePageListRevisionsParams = SitePageListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SitePageListRevisionsPageAsync>> =
            listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            params: SitePageListRevisionsParams = SitePageListRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<SitePageListRevisionsPageAsync>> =
            listRevisions(objectId, params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            params: SitePageListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SitePageListRevisionsPageAsync>>

        /** @see listRevisions */
        fun listRevisions(
            params: SitePageListRevisionsParams
        ): CompletableFuture<HttpResponseFor<SitePageListRevisionsPageAsync>> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SitePageListRevisionsPageAsync>> =
            listRevisions(objectId, SitePageListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/{objectId}/draft/push-live`, but is otherwise the same as
         * [SitePageServiceAsync.publishDraft].
         */
        fun publishDraft(objectId: String): CompletableFuture<HttpResponse> =
            publishDraft(objectId, SitePagePublishDraftParams.none())

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            params: SitePagePublishDraftParams = SitePagePublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            params: SitePagePublishDraftParams = SitePagePublishDraftParams.none(),
        ): CompletableFuture<HttpResponse> = publishDraft(objectId, params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            params: SitePagePublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see publishDraft */
        fun publishDraft(params: SitePagePublishDraftParams): CompletableFuture<HttpResponse> =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            publishDraft(objectId, SitePagePublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/ab-test/rerun`, but is
         * otherwise the same as [SitePageServiceAsync.rerunAbTest].
         */
        fun rerunAbTest(params: SitePageRerunAbTestParams): CompletableFuture<HttpResponse> =
            rerunAbTest(params, RequestOptions.none())

        /** @see rerunAbTest */
        fun rerunAbTest(
            params: SitePageRerunAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see rerunAbTest */
        fun rerunAbTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            rerunAbTest(
                SitePageRerunAbTestParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/{objectId}/draft/reset`,
         * but is otherwise the same as [SitePageServiceAsync.resetDraft].
         */
        fun resetDraft(objectId: String): CompletableFuture<HttpResponse> =
            resetDraft(objectId, SitePageResetDraftParams.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: SitePageResetDraftParams = SitePageResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: SitePageResetDraftParams = SitePageResetDraftParams.none(),
        ): CompletableFuture<HttpResponse> = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            params: SitePageResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resetDraft */
        fun resetDraft(params: SitePageResetDraftParams): CompletableFuture<HttpResponse> =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resetDraft(objectId, SitePageResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/{objectId}/revisions/{revisionId}/restore`, but is otherwise the
         * same as [SitePageServiceAsync.restoreRevision].
         */
        fun restoreRevision(
            revisionId: String,
            params: SitePageRestoreRevisionParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            revisionId: String,
            params: SitePageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        fun restoreRevision(
            params: SitePageRestoreRevisionParams
        ): CompletableFuture<HttpResponseFor<Page>> = restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        fun restoreRevision(
            params: SitePageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [SitePageServiceAsync.restoreRevisionToDraft].
         */
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: SitePageRestoreRevisionToDraftParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: SitePageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            params: SitePageRestoreRevisionToDraftParams
        ): CompletableFuture<HttpResponseFor<Page>> =
            restoreRevisionToDraft(params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        fun restoreRevisionToDraft(
            params: SitePageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/schedule`, but is
         * otherwise the same as [SitePageServiceAsync.schedule].
         */
        fun schedule(params: SitePageScheduleParams): CompletableFuture<HttpResponse> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            params: SitePageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            schedule(
                SitePageScheduleParams.builder()
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
         * /cms/v3/pages/site-pages/multi-language/set-new-lang-primary`, but is otherwise the same
         * as [SitePageServiceAsync.setNewLangPrimary].
         */
        fun setNewLangPrimary(
            params: SitePageSetNewLangPrimaryParams
        ): CompletableFuture<HttpResponse> = setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            params: SitePageSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            setNewLangPrimary(
                SitePageSetNewLangPrimaryParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/batch/update`, but is
         * otherwise the same as [SitePageServiceAsync.updateBatch].
         */
        fun updateBatch(
            params: SitePageUpdateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: SitePageUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>>

        /** @see updateBatch */
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateBatch(
                SitePageUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateBatch */
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode
        ): CompletableFuture<HttpResponseFor<BatchResponsePage>> =
            updateBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/site-pages/{objectId}/draft`, but is
         * otherwise the same as [SitePageServiceAsync.updateDraft].
         */
        fun updateDraft(
            objectId: String,
            params: SitePageUpdateDraftParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            objectId: String,
            params: SitePageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(
            params: SitePageUpdateDraftParams
        ): CompletableFuture<HttpResponseFor<Page>> = updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: SitePageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/multi-language/update-languages`, but is otherwise the same as
         * [SitePageServiceAsync.updateLanguages].
         */
        fun updateLanguages(
            params: SitePageUpdateLanguagesParams
        ): CompletableFuture<HttpResponse> = updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        fun updateLanguages(
            params: SitePageUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateLanguages */
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLanguages(
                SitePageUpdateLanguagesParams.builder()
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
