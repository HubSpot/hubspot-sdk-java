// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageCloneParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageCreateParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageDeleteParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageGetDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageGetParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageListPageAsync
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageListParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePagePublishDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageScheduleParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateDraftParams
import com.hubspot_sdk.api.models.cms.pages.websitepages.WebsitePageUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface WebsitePageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WebsitePageServiceAsync

    /** Create a new website page. */
    fun create(params: WebsitePageCreateParams): CompletableFuture<Page> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: WebsitePageCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see create */
    fun create(
        page: Page,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        create(WebsitePageCreateParams.builder().page(page).build(), requestOptions)

    /** @see create */
    fun create(page: Page): CompletableFuture<Page> = create(page, RequestOptions.none())

    /**
     * Partially updates a single website page, specified by its ID. You only need to specify the
     * column values that you are modifying.
     */
    fun update(objectId: String, params: WebsitePageUpdateParams): CompletableFuture<Page> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: WebsitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: WebsitePageUpdateParams): CompletableFuture<Page> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: WebsitePageUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * Retrieve all website pages. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    fun list(): CompletableFuture<WebsitePageListPageAsync> = list(WebsitePageListParams.none())

    /** @see list */
    fun list(
        params: WebsitePageListParams = WebsitePageListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WebsitePageListPageAsync>

    /** @see list */
    fun list(
        params: WebsitePageListParams = WebsitePageListParams.none()
    ): CompletableFuture<WebsitePageListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<WebsitePageListPageAsync> =
        list(WebsitePageListParams.none(), requestOptions)

    /** Delete a website page, specified by its ID. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, WebsitePageDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: WebsitePageDeleteParams = WebsitePageDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: WebsitePageDeleteParams = WebsitePageDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: WebsitePageDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: WebsitePageDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, WebsitePageDeleteParams.none(), requestOptions)

    /** Create a copy of an existing website page. */
    fun clone(params: WebsitePageCloneParams): CompletableFuture<Page> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: WebsitePageCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        clone(
            WebsitePageCloneParams.builder()
                .contentCloneRequestVNext(contentCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CompletableFuture<Page> =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Retrieve a website page by its ID. */
    fun get(objectId: String): CompletableFuture<Page> = get(objectId, WebsitePageGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: WebsitePageGetParams = WebsitePageGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: WebsitePageGetParams = WebsitePageGetParams.none(),
    ): CompletableFuture<Page> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: WebsitePageGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see get */
    fun get(params: WebsitePageGetParams): CompletableFuture<Page> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<Page> =
        get(objectId, WebsitePageGetParams.none(), requestOptions)

    /** Retrieve the full draft version of a website page, specified by its ID. */
    fun getDraft(objectId: String): CompletableFuture<Page> =
        getDraft(objectId, WebsitePageGetDraftParams.none())

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: WebsitePageGetDraftParams = WebsitePageGetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraft */
    fun getDraft(
        objectId: String,
        params: WebsitePageGetDraftParams = WebsitePageGetDraftParams.none(),
    ): CompletableFuture<Page> = getDraft(objectId, params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(
        params: WebsitePageGetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see getDraft */
    fun getDraft(params: WebsitePageGetDraftParams): CompletableFuture<Page> =
        getDraft(params, RequestOptions.none())

    /** @see getDraft */
    fun getDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Page> =
        getDraft(objectId, WebsitePageGetDraftParams.none(), requestOptions)

    /**
     * Take any changes from the draft version of the website page and apply them to the live
     * version.
     */
    fun publishDraft(objectId: String): CompletableFuture<Void?> =
        publishDraft(objectId, WebsitePagePublishDraftParams.none())

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: WebsitePagePublishDraftParams = WebsitePagePublishDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see publishDraft */
    fun publishDraft(
        objectId: String,
        params: WebsitePagePublishDraftParams = WebsitePagePublishDraftParams.none(),
    ): CompletableFuture<Void?> = publishDraft(objectId, params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(
        params: WebsitePagePublishDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see publishDraft */
    fun publishDraft(params: WebsitePagePublishDraftParams): CompletableFuture<Void?> =
        publishDraft(params, RequestOptions.none())

    /** @see publishDraft */
    fun publishDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        publishDraft(objectId, WebsitePagePublishDraftParams.none(), requestOptions)

    /** Schedule a website page to published at a future time. */
    fun schedule(params: WebsitePageScheduleParams): CompletableFuture<Void?> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: WebsitePageScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        schedule(
            WebsitePageScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext
    ): CompletableFuture<Void?> = schedule(contentScheduleRequestVNext, RequestOptions.none())

    /** Set a landing page as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: WebsitePageSetNewLangPrimaryParams): CompletableFuture<Void?> =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: WebsitePageSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        setNewLangPrimary(
            WebsitePageSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
    ): CompletableFuture<Void?> =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /**
     * Partially update the draft version of a website page, specified by page ID. You only need to
     * specify the values for the details that you're modifying.
     */
    fun updateDraft(
        objectId: String,
        params: WebsitePageUpdateDraftParams,
    ): CompletableFuture<Page> = updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: WebsitePageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: WebsitePageUpdateDraftParams): CompletableFuture<Page> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: WebsitePageUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /**
     * A view of [WebsitePageServiceAsync] that provides access to raw HTTP responses for each
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
        ): WebsitePageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages`, but is otherwise
         * the same as [WebsitePageServiceAsync.create].
         */
        fun create(params: WebsitePageCreateParams): CompletableFuture<HttpResponseFor<Page>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: WebsitePageCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see create */
        fun create(
            page: Page,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            create(WebsitePageCreateParams.builder().page(page).build(), requestOptions)

        /** @see create */
        fun create(page: Page): CompletableFuture<HttpResponseFor<Page>> =
            create(page, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [WebsitePageServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: WebsitePageUpdateParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: WebsitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: WebsitePageUpdateParams): CompletableFuture<HttpResponseFor<Page>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: WebsitePageUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages`, but is otherwise the
         * same as [WebsitePageServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<WebsitePageListPageAsync>> =
            list(WebsitePageListParams.none())

        /** @see list */
        fun list(
            params: WebsitePageListParams = WebsitePageListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WebsitePageListPageAsync>>

        /** @see list */
        fun list(
            params: WebsitePageListParams = WebsitePageListParams.none()
        ): CompletableFuture<HttpResponseFor<WebsitePageListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<WebsitePageListPageAsync>> =
            list(WebsitePageListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [WebsitePageServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, WebsitePageDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: WebsitePageDeleteParams = WebsitePageDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: WebsitePageDeleteParams = WebsitePageDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: WebsitePageDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: WebsitePageDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, WebsitePageDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/clone`, but is
         * otherwise the same as [WebsitePageServiceAsync.clone].
         */
        fun clone(params: WebsitePageCloneParams): CompletableFuture<HttpResponseFor<Page>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: WebsitePageCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            clone(
                WebsitePageCloneParams.builder()
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
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}`, but is
         * otherwise the same as [WebsitePageServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<Page>> =
            get(objectId, WebsitePageGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: WebsitePageGetParams = WebsitePageGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: WebsitePageGetParams = WebsitePageGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Page>> = get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: WebsitePageGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see get */
        fun get(params: WebsitePageGetParams): CompletableFuture<HttpResponseFor<Page>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> =
            get(objectId, WebsitePageGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/pages/2026-03/site-pages/{objectId}/draft`, but
         * is otherwise the same as [WebsitePageServiceAsync.getDraft].
         */
        fun getDraft(objectId: String): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, WebsitePageGetDraftParams.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: WebsitePageGetDraftParams = WebsitePageGetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            params: WebsitePageGetDraftParams = WebsitePageGetDraftParams.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            params: WebsitePageGetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see getDraft */
        fun getDraft(params: WebsitePageGetDraftParams): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(params, RequestOptions.none())

        /** @see getDraft */
        fun getDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Page>> =
            getDraft(objectId, WebsitePageGetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/{objectId}/draft/push-live`, but is otherwise the same as
         * [WebsitePageServiceAsync.publishDraft].
         */
        fun publishDraft(objectId: String): CompletableFuture<HttpResponse> =
            publishDraft(objectId, WebsitePagePublishDraftParams.none())

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            params: WebsitePagePublishDraftParams = WebsitePagePublishDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            publishDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            params: WebsitePagePublishDraftParams = WebsitePagePublishDraftParams.none(),
        ): CompletableFuture<HttpResponse> = publishDraft(objectId, params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            params: WebsitePagePublishDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see publishDraft */
        fun publishDraft(params: WebsitePagePublishDraftParams): CompletableFuture<HttpResponse> =
            publishDraft(params, RequestOptions.none())

        /** @see publishDraft */
        fun publishDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            publishDraft(objectId, WebsitePagePublishDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/site-pages/schedule`, but is
         * otherwise the same as [WebsitePageServiceAsync.schedule].
         */
        fun schedule(params: WebsitePageScheduleParams): CompletableFuture<HttpResponse> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            params: WebsitePageScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            schedule(
                WebsitePageScheduleParams.builder()
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
         * /cms/pages/2026-03/landing-pages/multi-language/set-new-lang-primary`, but is otherwise
         * the same as [WebsitePageServiceAsync.setNewLangPrimary].
         */
        fun setNewLangPrimary(
            params: WebsitePageSetNewLangPrimaryParams
        ): CompletableFuture<HttpResponse> = setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            params: WebsitePageSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            setNewLangPrimary(
                WebsitePageSetNewLangPrimaryParams.builder()
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
         * Returns a raw HTTP response for `patch /cms/pages/2026-03/site-pages/{objectId}/draft`,
         * but is otherwise the same as [WebsitePageServiceAsync.updateDraft].
         */
        fun updateDraft(
            objectId: String,
            params: WebsitePageUpdateDraftParams,
        ): CompletableFuture<HttpResponseFor<Page>> =
            updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            objectId: String,
            params: WebsitePageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(
            params: WebsitePageUpdateDraftParams
        ): CompletableFuture<HttpResponseFor<Page>> = updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: WebsitePageUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>
    }
}
