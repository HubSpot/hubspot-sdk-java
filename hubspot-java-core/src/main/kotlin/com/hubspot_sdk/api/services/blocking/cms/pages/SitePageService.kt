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
import com.hubspot_sdk.api.models.cms.pages.BatchInputPage
import com.hubspot_sdk.api.models.cms.pages.BatchResponsePage
import com.hubspot_sdk.api.models.cms.pages.CollectionResponseWithTotalVersionPage
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
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageListPage
import com.hubspot_sdk.api.models.cms.pages.sitepages.SitePageListParams
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
import java.util.function.Consumer

interface SitePageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SitePageService

    /** Create a new Site Page */
    fun create(params: SitePageCreateParams) = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: SitePageCreateParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see create */
    fun create(page: Page, requestOptions: RequestOptions = RequestOptions.none()) =
        create(SitePageCreateParams.builder().page(page).build(), requestOptions)

    /** @see create */
    fun create(page: Page) = create(page, RequestOptions.none())

    /**
     * Sparse updates a single Site Page object identified by the id in the path. You only need to
     * specify the column values that you are modifying.
     */
    fun update(objectId: String, params: SitePageUpdateParams): Page =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: SitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: SitePageUpdateParams): Page = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: SitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /**
     * Get the list of site pages. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    fun list(): SitePageListPage = list(SitePageListParams.none())

    /** @see list */
    fun list(
        params: SitePageListParams = SitePageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SitePageListPage

    /** @see list */
    fun list(params: SitePageListParams = SitePageListParams.none()): SitePageListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SitePageListPage =
        list(SitePageListParams.none(), requestOptions)

    /** Delete the Site Page object identified by the id in the path. */
    fun delete(objectId: String) = delete(objectId, SitePageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: SitePageDeleteParams = SitePageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: SitePageDeleteParams = SitePageDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: SitePageDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: SitePageDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, SitePageDeleteParams.none(), requestOptions)

    /** Attach a site page to a multi-language group. */
    fun attachToLangGroup(params: SitePageAttachToLangGroupParams) =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: SitePageAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        attachToLangGroup(
            SitePageAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext) =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Clone a Site Page */
    fun clone(params: SitePageCloneParams): Page = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: SitePageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        clone(
            SitePageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): Page =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createAbTestVariation(params: SitePageCreateAbTestVariationParams): Page =
        createAbTestVariation(params, RequestOptions.none())

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        params: SitePageCreateAbTestVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see createAbTestVariation */
    fun createAbTestVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        createAbTestVariation(
            SitePageCreateAbTestVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createAbTestVariation */
    fun createAbTestVariation(abTestCreateRequestVNext: AbTestCreateRequestVNext): Page =
        createAbTestVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** Create the Site Page objects detailed in the request body. */
    fun createBatch(params: SitePageCreateBatchParams): BatchResponsePage =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: SitePageCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see createBatch */
    fun createBatch(
        batchInputPage: BatchInputPage,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        createBatch(
            SitePageCreateBatchParams.builder().batchInputPage(batchInputPage).build(),
            requestOptions,
        )

    /** @see createBatch */
    fun createBatch(batchInputPage: BatchInputPage): BatchResponsePage =
        createBatch(batchInputPage, RequestOptions.none())

    /** Create a new language variation from an existing site page */
    fun createLanguageVariation(params: SitePageCreateLanguageVariationParams): Page =
        createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: SitePageCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        createLanguageVariation(
            SitePageCreateLanguageVariationParams.builder()
                .contentLanguageCloneRequestVNext(contentLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
    ): Page = createLanguageVariation(contentLanguageCloneRequestVNext, RequestOptions.none())

    /**
     * Delete the Site Page objects identified in the request body. Note: This is not the same as
     * the dashboard `archive` function. To perform a dashboard `archive` send an normal update with
     * the `archivedInDashboard` field set to true.
     */
    fun deleteBatch(params: SitePageDeleteBatchParams) = deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: SitePageDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteBatch(
            SitePageDeleteBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteBatch */
    fun deleteBatch(batchInputString: BatchInputString) =
        deleteBatch(batchInputString, RequestOptions.none())

    /** Detach a site page from a multi-language group. */
    fun detachFromLangGroup(params: SitePageDetachFromLangGroupParams) =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: SitePageDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        detachFromLangGroup(
            SitePageDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext) =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endAbTest(params: SitePageEndAbTestParams) = endAbTest(params, RequestOptions.none())

    /** @see endAbTest */
    fun endAbTest(
        params: SitePageEndAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see endAbTest */
    fun endAbTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        endAbTest(
            SitePageEndAbTestParams.builder().abTestEndRequestVNext(abTestEndRequestVNext).build(),
            requestOptions,
        )

    /** @see endAbTest */
    fun endAbTest(abTestEndRequestVNext: AbTestEndRequestVNext) =
        endAbTest(abTestEndRequestVNext, RequestOptions.none())

    /** Retrieve the Site Page object identified by the id in the path. */
    fun get(objectId: String): Page = get(objectId, SitePageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: SitePageGetParams = SitePageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: SitePageGetParams = SitePageGetParams.none()): Page =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(params: SitePageGetParams, requestOptions: RequestOptions = RequestOptions.none()): Page

    /** @see get */
    fun get(params: SitePageGetParams): Page = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): Page =
        get(objectId, SitePageGetParams.none(), requestOptions)

    /** Retrieve the Site Page objects identified in the request body. */
    fun getBatch(params: SitePageGetBatchParams): BatchResponsePage =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: SitePageGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see getBatch */
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        getBatch(
            SitePageGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    fun getBatch(batchInputString: BatchInputString): BatchResponsePage =
        getBatch(batchInputString, RequestOptions.none())

    /** Retrieve the full draft version of the Site Page. */
    fun getDraft(objectId: String): Page = getDraft(objectId, SitePageGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: SitePageGetDraftParams = SitePageGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: SitePageGetDraftParams = SitePageGetDraftParams.none(),
    ): Page = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: SitePageGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** @see getDraft */
    fun getDraft(params: SitePageGetDraftParams): Page = getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): Page =
        getDraft(objectId, SitePageGetDraftParams.none(), requestOptions)

    /** Retrieves a previous version of a Site Page */
    fun getRevision(revisionId: String, params: SitePageGetRevisionParams): VersionPage =
        getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: SitePageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionPage = getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: SitePageGetRevisionParams): VersionPage =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: SitePageGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionPage

    /** Retrieves all the previous versions of a Site Page. */
    fun listRevisions(objectId: String): CollectionResponseWithTotalVersionPage =
        listRevisions(objectId, SitePageListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: SitePageListRevisionsParams = SitePageListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalVersionPage =
        listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        params: SitePageListRevisionsParams = SitePageListRevisionsParams.none(),
    ): CollectionResponseWithTotalVersionPage =
        listRevisions(objectId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: SitePageListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CollectionResponseWithTotalVersionPage

    /** @see listRevisions */
    fun listRevisions(params: SitePageListRevisionsParams): CollectionResponseWithTotalVersionPage =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CollectionResponseWithTotalVersionPage =
        listRevisions(objectId, SitePageListRevisionsParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the Site Page and apply them to the live version.
     */
    fun publishDraft(objectId: String) = publishDraft(objectId, SitePagePublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: SitePagePublishDraftParams = SitePagePublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: SitePagePublishDraftParams = SitePagePublishDraftParams.none(),
    ) = publishDraft(objectId, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: SitePagePublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see publishDraft */
    fun publishDraft(params: SitePagePublishDraftParams) =
        publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(objectId: String, requestOptions: RequestOptions) =
        publishDraft(objectId, SitePagePublishDraftParams.none(), requestOptions)

    /** Rerun a previous A/B test. */
    fun rerunAbTest(params: SitePageRerunAbTestParams) = rerunAbTest(params, RequestOptions.none())

    /** @see rerunAbTest */
    fun rerunAbTest(
        params: SitePageRerunAbTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rerunAbTest */
    fun rerunAbTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        rerunAbTest(
            SitePageRerunAbTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunAbTest */
    fun rerunAbTest(abTestRerunRequestVNext: AbTestRerunRequestVNext) =
        rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())

    /** Discards any edits and resets the draft to the live version. */
    fun resetDraft(objectId: String) = resetDraft(objectId, SitePageResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: SitePageResetDraftParams = SitePageResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: SitePageResetDraftParams = SitePageResetDraftParams.none(),
    ) = resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: SitePageResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resetDraft */
    fun resetDraft(params: SitePageResetDraftParams) = resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions) =
        resetDraft(objectId, SitePageResetDraftParams.none(), requestOptions)

    /** Takes a specified version of a Site Page and restores it. */
    fun restoreRevision(revisionId: String, params: SitePageRestoreRevisionParams): Page =
        restoreRevision(revisionId, params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        revisionId: String,
        params: SitePageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevision */
    fun restoreRevision(params: SitePageRestoreRevisionParams): Page =
        restoreRevision(params, RequestOptions.none())

    /** @see restoreRevision */
    fun restoreRevision(
        params: SitePageRestoreRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /**
     * Takes a specified version of a Site Page, sets it as the new draft version of the Site Page.
     */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: SitePageRestoreRevisionToDraftParams,
    ): Page = restoreRevisionToDraft(revisionId, params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        revisionId: Long,
        params: SitePageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page =
        restoreRevisionToDraft(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(params: SitePageRestoreRevisionToDraftParams): Page =
        restoreRevisionToDraft(params, RequestOptions.none())

    /** @see restoreRevisionToDraft */
    fun restoreRevisionToDraft(
        params: SitePageRestoreRevisionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** Schedule a Site Page to be Published */
    fun schedule(params: SitePageScheduleParams) = schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: SitePageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        schedule(
            SitePageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext) =
        schedule(contentScheduleRequestVNext, RequestOptions.none())

    /** Set a site page as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: SitePageSetNewLangPrimaryParams) =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: SitePageSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        setNewLangPrimary(
            SitePageSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext) =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Update the Site Page objects identified in the request body. */
    fun updateBatch(params: SitePageUpdateBatchParams): BatchResponsePage =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: SitePageUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponsePage =
        updateBatch(
            SitePageUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): BatchResponsePage =
        updateBatch(batchInputJsonNode, RequestOptions.none())

    /**
     * Sparse updates the draft version of a single Site Page object identified by the id in the
     * path. You only need to specify the column values that you are modifying.
     */
    fun updateDraft(objectId: String, params: SitePageUpdateDraftParams): Page =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: SitePageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: SitePageUpdateDraftParams): Page =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: SitePageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Page

    /** Explicitly set new languages for each site page in a multi-language group. */
    fun updateLanguages(params: SitePageUpdateLanguagesParams) =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: SitePageUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        updateLanguages(
            SitePageUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLanguages */
    fun updateLanguages(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext) =
        updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [SitePageService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SitePageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages`, but is otherwise the
         * same as [SitePageService.create].
         */
        @MustBeClosed
        fun create(params: SitePageCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: SitePageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            page: Page,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = create(SitePageCreateParams.builder().page(page).build(), requestOptions)

        /** @see create */
        @MustBeClosed fun create(page: Page): HttpResponse = create(page, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: SitePageUpdateParams): HttpResponseFor<Page> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: SitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: SitePageUpdateParams): HttpResponseFor<Page> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: SitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/site-pages`, but is otherwise the same
         * as [SitePageService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<SitePageListPage> = list(SitePageListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SitePageListParams = SitePageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SitePageListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SitePageListParams = SitePageListParams.none()
        ): HttpResponseFor<SitePageListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SitePageListPage> =
            list(SitePageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/pages/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse = delete(objectId, SitePageDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: SitePageDeleteParams = SitePageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: SitePageDeleteParams = SitePageDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: SitePageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: SitePageDeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, SitePageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/multi-language/attach-to-lang-group`, but is otherwise the same
         * as [SitePageService.attachToLangGroup].
         */
        @MustBeClosed
        fun attachToLangGroup(params: SitePageAttachToLangGroupParams): HttpResponse =
            attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            params: SitePageAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            attachToLangGroup(
                SitePageAttachToLangGroupParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/clone`, but is otherwise
         * the same as [SitePageService.clone].
         */
        @MustBeClosed
        fun clone(params: SitePageCloneParams): HttpResponseFor<Page> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: SitePageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see clone */
        @MustBeClosed
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            clone(
                SitePageCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponseFor<Page> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/ab-test/create-variation`,
         * but is otherwise the same as [SitePageService.createAbTestVariation].
         */
        @MustBeClosed
        fun createAbTestVariation(
            params: SitePageCreateAbTestVariationParams
        ): HttpResponseFor<Page> = createAbTestVariation(params, RequestOptions.none())

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            params: SitePageCreateAbTestVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see createAbTestVariation */
        @MustBeClosed
        fun createAbTestVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            createAbTestVariation(
                SitePageCreateAbTestVariationParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/batch/create`, but is
         * otherwise the same as [SitePageService.createBatch].
         */
        @MustBeClosed
        fun createBatch(params: SitePageCreateBatchParams): HttpResponseFor<BatchResponsePage> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            params: SitePageCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            batchInputPage: BatchInputPage,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            createBatch(
                SitePageCreateBatchParams.builder().batchInputPage(batchInputPage).build(),
                requestOptions,
            )

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(batchInputPage: BatchInputPage): HttpResponseFor<BatchResponsePage> =
            createBatch(batchInputPage, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/multi-language/create-language-variation`, but is otherwise the
         * same as [SitePageService.createLanguageVariation].
         */
        @MustBeClosed
        fun createLanguageVariation(
            params: SitePageCreateLanguageVariationParams
        ): HttpResponseFor<Page> = createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            params: SitePageCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            createLanguageVariation(
                SitePageCreateLanguageVariationParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/batch/archive`, but is
         * otherwise the same as [SitePageService.deleteBatch].
         */
        @MustBeClosed
        fun deleteBatch(params: SitePageDeleteBatchParams): HttpResponse =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            params: SitePageDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteBatch(
                SitePageDeleteBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(batchInputString: BatchInputString): HttpResponse =
            deleteBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [SitePageService.detachFromLangGroup].
         */
        @MustBeClosed
        fun detachFromLangGroup(params: SitePageDetachFromLangGroupParams): HttpResponse =
            detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            params: SitePageDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            detachFromLangGroup(
                SitePageDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/ab-test/end`, but is
         * otherwise the same as [SitePageService.endAbTest].
         */
        @MustBeClosed
        fun endAbTest(params: SitePageEndAbTestParams): HttpResponse =
            endAbTest(params, RequestOptions.none())

        /** @see endAbTest */
        @MustBeClosed
        fun endAbTest(
            params: SitePageEndAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see endAbTest */
        @MustBeClosed
        fun endAbTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            endAbTest(
                SitePageEndAbTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endAbTest */
        @MustBeClosed
        fun endAbTest(abTestEndRequestVNext: AbTestEndRequestVNext): HttpResponse =
            endAbTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/site-pages/{objectId}`, but is
         * otherwise the same as [SitePageService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<Page> = get(objectId, SitePageGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: SitePageGetParams = SitePageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: SitePageGetParams = SitePageGetParams.none(),
        ): HttpResponseFor<Page> = get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SitePageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see get */
        @MustBeClosed
        fun get(params: SitePageGetParams): HttpResponseFor<Page> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponseFor<Page> =
            get(objectId, SitePageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/batch/read`, but is
         * otherwise the same as [SitePageService.getBatch].
         */
        @MustBeClosed
        fun getBatch(params: SitePageGetBatchParams): HttpResponseFor<BatchResponsePage> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            params: SitePageGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            getBatch(
                SitePageGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(batchInputString: BatchInputString): HttpResponseFor<BatchResponsePage> =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/site-pages/{objectId}/draft`, but is
         * otherwise the same as [SitePageService.getDraft].
         */
        @MustBeClosed
        fun getDraft(objectId: String): HttpResponseFor<Page> =
            getDraft(objectId, SitePageGetDraftParams.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: SitePageGetDraftParams = SitePageGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            objectId: String,
            params: SitePageGetDraftParams = SitePageGetDraftParams.none(),
        ): HttpResponseFor<Page> = getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(
            params: SitePageGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(params: SitePageGetDraftParams): HttpResponseFor<Page> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        @MustBeClosed
        fun getDraft(objectId: String, requestOptions: RequestOptions): HttpResponseFor<Page> =
            getDraft(objectId, SitePageGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/pages/site-pages/{objectId}/revisions/{revisionId}`, but is otherwise the same as
         * [SitePageService.getRevision].
         */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: SitePageGetRevisionParams,
        ): HttpResponseFor<VersionPage> = getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: SitePageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionPage> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(params: SitePageGetRevisionParams): HttpResponseFor<VersionPage> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            params: SitePageGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionPage>

        /**
         * Returns a raw HTTP response for `get /cms/v3/pages/site-pages/{objectId}/revisions`, but
         * is otherwise the same as [SitePageService.listRevisions].
         */
        @MustBeClosed
        fun listRevisions(
            objectId: String
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(objectId, SitePageListRevisionsParams.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            params: SitePageListRevisionsParams = SitePageListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            params: SitePageListRevisionsParams = SitePageListRevisionsParams.none(),
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(objectId, params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: SitePageListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage>

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: SitePageListRevisionsParams
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CollectionResponseWithTotalVersionPage> =
            listRevisions(objectId, SitePageListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/{objectId}/draft/push-live`, but is otherwise the same as
         * [SitePageService.publishDraft].
         */
        @MustBeClosed
        fun publishDraft(objectId: String): HttpResponse =
            publishDraft(objectId, SitePagePublishDraftParams.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            objectId: String,
            params: SitePagePublishDraftParams = SitePagePublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            objectId: String,
            params: SitePagePublishDraftParams = SitePagePublishDraftParams.none(),
        ): HttpResponse = publishDraft(objectId, params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(
            params: SitePagePublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(params: SitePagePublishDraftParams): HttpResponse =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        @MustBeClosed
        fun publishDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            publishDraft(objectId, SitePagePublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/ab-test/rerun`, but is
         * otherwise the same as [SitePageService.rerunAbTest].
         */
        @MustBeClosed
        fun rerunAbTest(params: SitePageRerunAbTestParams): HttpResponse =
            rerunAbTest(params, RequestOptions.none())

        /** @see rerunAbTest */
        @MustBeClosed
        fun rerunAbTest(
            params: SitePageRerunAbTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rerunAbTest */
        @MustBeClosed
        fun rerunAbTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            rerunAbTest(
                SitePageRerunAbTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunAbTest */
        @MustBeClosed
        fun rerunAbTest(abTestRerunRequestVNext: AbTestRerunRequestVNext): HttpResponse =
            rerunAbTest(abTestRerunRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/{objectId}/draft/reset`,
         * but is otherwise the same as [SitePageService.resetDraft].
         */
        @MustBeClosed
        fun resetDraft(objectId: String): HttpResponse =
            resetDraft(objectId, SitePageResetDraftParams.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: SitePageResetDraftParams = SitePageResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: SitePageResetDraftParams = SitePageResetDraftParams.none(),
        ): HttpResponse = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            params: SitePageResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(params: SitePageResetDraftParams): HttpResponse =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            resetDraft(objectId, SitePageResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/{objectId}/revisions/{revisionId}/restore`, but is otherwise the
         * same as [SitePageService.restoreRevision].
         */
        @MustBeClosed
        fun restoreRevision(
            revisionId: String,
            params: SitePageRestoreRevisionParams,
        ): HttpResponseFor<Page> = restoreRevision(revisionId, params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            revisionId: String,
            params: SitePageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(params: SitePageRestoreRevisionParams): HttpResponseFor<Page> =
            restoreRevision(params, RequestOptions.none())

        /** @see restoreRevision */
        @MustBeClosed
        fun restoreRevision(
            params: SitePageRestoreRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [SitePageService.restoreRevisionToDraft].
         */
        @MustBeClosed
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: SitePageRestoreRevisionToDraftParams,
        ): HttpResponseFor<Page> = restoreRevisionToDraft(revisionId, params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            revisionId: Long,
            params: SitePageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            restoreRevisionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            params: SitePageRestoreRevisionToDraftParams
        ): HttpResponseFor<Page> = restoreRevisionToDraft(params, RequestOptions.none())

        /** @see restoreRevisionToDraft */
        @MustBeClosed
        fun restoreRevisionToDraft(
            params: SitePageRestoreRevisionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/schedule`, but is
         * otherwise the same as [SitePageService.schedule].
         */
        @MustBeClosed
        fun schedule(params: SitePageScheduleParams): HttpResponse =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: SitePageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            schedule(
                SitePageScheduleParams.builder()
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
         * /cms/v3/pages/site-pages/multi-language/set-new-lang-primary`, but is otherwise the same
         * as [SitePageService.setNewLangPrimary].
         */
        @MustBeClosed
        fun setNewLangPrimary(params: SitePageSetNewLangPrimaryParams): HttpResponse =
            setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            params: SitePageSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            setNewLangPrimary(
                SitePageSetNewLangPrimaryParams.builder()
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
         * Returns a raw HTTP response for `post /cms/v3/pages/site-pages/batch/update`, but is
         * otherwise the same as [SitePageService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(params: SitePageUpdateBatchParams): HttpResponseFor<BatchResponsePage> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: SitePageUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage>

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponsePage> =
            updateBatch(
                SitePageUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode
        ): HttpResponseFor<BatchResponsePage> =
            updateBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/pages/site-pages/{objectId}/draft`, but is
         * otherwise the same as [SitePageService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: SitePageUpdateDraftParams,
        ): HttpResponseFor<Page> = updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: SitePageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: SitePageUpdateDraftParams): HttpResponseFor<Page> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: SitePageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Page>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/pages/site-pages/multi-language/update-languages`, but is otherwise the same as
         * [SitePageService.updateLanguages].
         */
        @MustBeClosed
        fun updateLanguages(params: SitePageUpdateLanguagesParams): HttpResponse =
            updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            params: SitePageUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLanguages(
                SitePageUpdateLanguagesParams.builder()
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
