// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.tags.Tag
import com.hubspot_sdk.api.models.cms.blogs.tags.TagAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCloneRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateLangVariationParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagGetParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListAuthorsCursorByQueryParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListAuthorsCursorParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListCursorByQueryParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListCursorParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListPostsCursorByQueryParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListPostsCursorParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagSetLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateLangsParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateParams
import com.hubspot_sdk.api.services.blocking.cms.blogs.tags.BatchService
import java.util.function.Consumer

interface TagService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService

    fun batch(): BatchService

    /** Create a new Blog Tag. */
    @MustBeClosed
    fun create(params: TagCreateParams): HttpResponse = create(params, RequestOptions.none())

    /** @see create */
    @MustBeClosed
    fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see create */
    @MustBeClosed
    fun create(tag: Tag, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
        create(TagCreateParams.builder().tag(tag).build(), requestOptions)

    /** @see create */
    @MustBeClosed fun create(tag: Tag): HttpResponse = create(tag, RequestOptions.none())

    /**
     * Sparse updates a single Blog Tag object identified by the id in the path. All the column
     * values need not be specified. Only the that need to be modified can be specified.
     */
    @MustBeClosed
    fun update(objectId: String, params: TagUpdateParams): HttpResponse =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    @MustBeClosed
    fun update(
        objectId: String,
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    @MustBeClosed
    fun update(params: TagUpdateParams): HttpResponse = update(params, RequestOptions.none())

    /** @see update */
    @MustBeClosed
    fun update(
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /**
     * Get the list of blog tags. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    @MustBeClosed fun list(): HttpResponse = list(TagListParams.none())

    /** @see list */
    @MustBeClosed
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see list */
    @MustBeClosed
    fun list(params: TagListParams = TagListParams.none()): HttpResponse =
        list(params, RequestOptions.none())

    /** @see list */
    @MustBeClosed
    fun list(requestOptions: RequestOptions): HttpResponse =
        list(TagListParams.none(), requestOptions)

    /** Delete the Blog Tag object identified by the id in the path. */
    fun delete(objectId: String) = delete(objectId, TagDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: TagDeleteParams = TagDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: TagDeleteParams = TagDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: TagDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: TagDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, TagDeleteParams.none(), requestOptions)

    /** Attach a Blog Tag to a multi-language group. */
    @MustBeClosed
    fun attachToLangGroup(params: TagAttachToLangGroupParams): HttpResponse =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        params: TagAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        attachToLangGroup(
            TagAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): HttpResponse = attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create a new language variation from an existing Blog Tag */
    @MustBeClosed
    fun createLangVariation(params: TagCreateLangVariationParams): HttpResponse =
        createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    @MustBeClosed
    fun createLangVariation(
        params: TagCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see createLangVariation */
    @MustBeClosed
    fun createLangVariation(
        tagCloneRequestVNext: TagCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        createLangVariation(
            TagCreateLangVariationParams.builder()
                .tagCloneRequestVNext(tagCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    @MustBeClosed
    fun createLangVariation(tagCloneRequestVNext: TagCloneRequestVNext): HttpResponse =
        createLangVariation(tagCloneRequestVNext, RequestOptions.none())

    /** Detach a Blog Tag from a multi-language group. */
    @MustBeClosed
    fun detachFromLangGroup(params: TagDetachFromLangGroupParams): HttpResponse =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        params: TagDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        detachFromLangGroup(
            TagDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): HttpResponse = detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the Blog Tag object identified by the id in the path. */
    @MustBeClosed fun get(objectId: String): HttpResponse = get(objectId, TagGetParams.none())

    /** @see get */
    @MustBeClosed
    fun get(
        objectId: String,
        params: TagGetParams = TagGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    @MustBeClosed
    fun get(objectId: String, params: TagGetParams = TagGetParams.none()): HttpResponse =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(
        params: TagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see get */
    @MustBeClosed fun get(params: TagGetParams): HttpResponse = get(params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(objectId: String, requestOptions: RequestOptions): HttpResponse =
        get(objectId, TagGetParams.none(), requestOptions)

    @MustBeClosed
    fun listAuthorsCursor(): HttpResponse = listAuthorsCursor(TagListAuthorsCursorParams.none())

    /** @see listAuthorsCursor */
    @MustBeClosed
    fun listAuthorsCursor(
        params: TagListAuthorsCursorParams = TagListAuthorsCursorParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see listAuthorsCursor */
    @MustBeClosed
    fun listAuthorsCursor(
        params: TagListAuthorsCursorParams = TagListAuthorsCursorParams.none()
    ): HttpResponse = listAuthorsCursor(params, RequestOptions.none())

    /** @see listAuthorsCursor */
    @MustBeClosed
    fun listAuthorsCursor(requestOptions: RequestOptions): HttpResponse =
        listAuthorsCursor(TagListAuthorsCursorParams.none(), requestOptions)

    @MustBeClosed
    fun listAuthorsCursorByQuery(): HttpResponse =
        listAuthorsCursorByQuery(TagListAuthorsCursorByQueryParams.none())

    /** @see listAuthorsCursorByQuery */
    @MustBeClosed
    fun listAuthorsCursorByQuery(
        params: TagListAuthorsCursorByQueryParams = TagListAuthorsCursorByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see listAuthorsCursorByQuery */
    @MustBeClosed
    fun listAuthorsCursorByQuery(
        params: TagListAuthorsCursorByQueryParams = TagListAuthorsCursorByQueryParams.none()
    ): HttpResponse = listAuthorsCursorByQuery(params, RequestOptions.none())

    /** @see listAuthorsCursorByQuery */
    @MustBeClosed
    fun listAuthorsCursorByQuery(requestOptions: RequestOptions): HttpResponse =
        listAuthorsCursorByQuery(TagListAuthorsCursorByQueryParams.none(), requestOptions)

    @MustBeClosed fun listCursor(): HttpResponse = listCursor(TagListCursorParams.none())

    /** @see listCursor */
    @MustBeClosed
    fun listCursor(
        params: TagListCursorParams = TagListCursorParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see listCursor */
    @MustBeClosed
    fun listCursor(params: TagListCursorParams = TagListCursorParams.none()): HttpResponse =
        listCursor(params, RequestOptions.none())

    /** @see listCursor */
    @MustBeClosed
    fun listCursor(requestOptions: RequestOptions): HttpResponse =
        listCursor(TagListCursorParams.none(), requestOptions)

    @MustBeClosed
    fun listCursorByQuery(): HttpResponse = listCursorByQuery(TagListCursorByQueryParams.none())

    /** @see listCursorByQuery */
    @MustBeClosed
    fun listCursorByQuery(
        params: TagListCursorByQueryParams = TagListCursorByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see listCursorByQuery */
    @MustBeClosed
    fun listCursorByQuery(
        params: TagListCursorByQueryParams = TagListCursorByQueryParams.none()
    ): HttpResponse = listCursorByQuery(params, RequestOptions.none())

    /** @see listCursorByQuery */
    @MustBeClosed
    fun listCursorByQuery(requestOptions: RequestOptions): HttpResponse =
        listCursorByQuery(TagListCursorByQueryParams.none(), requestOptions)

    @MustBeClosed
    fun listPostsCursor(): HttpResponse = listPostsCursor(TagListPostsCursorParams.none())

    /** @see listPostsCursor */
    @MustBeClosed
    fun listPostsCursor(
        params: TagListPostsCursorParams = TagListPostsCursorParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see listPostsCursor */
    @MustBeClosed
    fun listPostsCursor(
        params: TagListPostsCursorParams = TagListPostsCursorParams.none()
    ): HttpResponse = listPostsCursor(params, RequestOptions.none())

    /** @see listPostsCursor */
    @MustBeClosed
    fun listPostsCursor(requestOptions: RequestOptions): HttpResponse =
        listPostsCursor(TagListPostsCursorParams.none(), requestOptions)

    @MustBeClosed
    fun listPostsCursorByQuery(): HttpResponse =
        listPostsCursorByQuery(TagListPostsCursorByQueryParams.none())

    /** @see listPostsCursorByQuery */
    @MustBeClosed
    fun listPostsCursorByQuery(
        params: TagListPostsCursorByQueryParams = TagListPostsCursorByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see listPostsCursorByQuery */
    @MustBeClosed
    fun listPostsCursorByQuery(
        params: TagListPostsCursorByQueryParams = TagListPostsCursorByQueryParams.none()
    ): HttpResponse = listPostsCursorByQuery(params, RequestOptions.none())

    /** @see listPostsCursorByQuery */
    @MustBeClosed
    fun listPostsCursorByQuery(requestOptions: RequestOptions): HttpResponse =
        listPostsCursorByQuery(TagListPostsCursorByQueryParams.none(), requestOptions)

    /** Set a Blog Tag as the primary language of a multi-language group. */
    fun setLangPrimary(params: TagSetLangPrimaryParams) =
        setLangPrimary(params, RequestOptions.none())

    /** @see setLangPrimary */
    fun setLangPrimary(
        params: TagSetLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see setLangPrimary */
    fun setLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        setLangPrimary(
            TagSetLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setLangPrimary */
    fun setLangPrimary(setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext) =
        setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Explicitly set new languages for each Blog Tag in a multi-language group. */
    @MustBeClosed
    fun updateLangs(params: TagUpdateLangsParams): HttpResponse =
        updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    @MustBeClosed
    fun updateLangs(
        params: TagUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see updateLangs */
    @MustBeClosed
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        updateLangs(
            TagUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    @MustBeClosed
    fun updateLangs(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext): HttpResponse =
        updateLangs(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [TagService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags`, but is otherwise the same
         * as [TagService.create].
         */
        @MustBeClosed
        fun create(params: TagCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(tag: Tag, requestOptions: RequestOptions = RequestOptions.none()): HttpResponse =
            create(TagCreateParams.builder().tag(tag).build(), requestOptions)

        /** @see create */
        @MustBeClosed fun create(tag: Tag): HttpResponse = create(tag, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/tags/{objectId}`, but is
         * otherwise the same as [TagService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: TagUpdateParams): HttpResponse =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TagUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags`, but is otherwise the same
         * as [TagService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(TagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: TagListParams = TagListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/blogs/2026-03/tags/{objectId}`, but is
         * otherwise the same as [TagService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse = delete(objectId, TagDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: TagDeleteParams = TagDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: TagDeleteParams = TagDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: TagDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, TagDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/tags/multi-language/attach-to-lang-group`, but is otherwise the same
         * as [TagService.attachToLangGroup].
         */
        @MustBeClosed
        fun attachToLangGroup(params: TagAttachToLangGroupParams): HttpResponse =
            attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            params: TagAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            attachToLangGroup(
                TagAttachToLangGroupParams.builder()
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
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/tags/multi-language/create-language-variation`, but is otherwise the
         * same as [TagService.createLangVariation].
         */
        @MustBeClosed
        fun createLangVariation(params: TagCreateLangVariationParams): HttpResponse =
            createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            params: TagCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            tagCloneRequestVNext: TagCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createLangVariation(
                TagCreateLangVariationParams.builder()
                    .tagCloneRequestVNext(tagCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(tagCloneRequestVNext: TagCloneRequestVNext): HttpResponse =
            createLangVariation(tagCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/tags/multi-language/detach-from-lang-group`, but is otherwise the same
         * as [TagService.detachFromLangGroup].
         */
        @MustBeClosed
        fun detachFromLangGroup(params: TagDetachFromLangGroupParams): HttpResponse =
            detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            params: TagDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            detachFromLangGroup(
                TagDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/{objectId}`, but is
         * otherwise the same as [TagService.get].
         */
        @MustBeClosed fun get(objectId: String): HttpResponse = get(objectId, TagGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: TagGetParams = TagGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, params: TagGetParams = TagGetParams.none()): HttpResponse =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see get */
        @MustBeClosed
        fun get(params: TagGetParams): HttpResponse = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponse =
            get(objectId, TagGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor`, but is otherwise
         * the same as [TagService.listAuthorsCursor].
         */
        @MustBeClosed
        fun listAuthorsCursor(): HttpResponse = listAuthorsCursor(TagListAuthorsCursorParams.none())

        /** @see listAuthorsCursor */
        @MustBeClosed
        fun listAuthorsCursor(
            params: TagListAuthorsCursorParams = TagListAuthorsCursorParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listAuthorsCursor */
        @MustBeClosed
        fun listAuthorsCursor(
            params: TagListAuthorsCursorParams = TagListAuthorsCursorParams.none()
        ): HttpResponse = listAuthorsCursor(params, RequestOptions.none())

        /** @see listAuthorsCursor */
        @MustBeClosed
        fun listAuthorsCursor(requestOptions: RequestOptions): HttpResponse =
            listAuthorsCursor(TagListAuthorsCursorParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor/query`, but is
         * otherwise the same as [TagService.listAuthorsCursorByQuery].
         */
        @MustBeClosed
        fun listAuthorsCursorByQuery(): HttpResponse =
            listAuthorsCursorByQuery(TagListAuthorsCursorByQueryParams.none())

        /** @see listAuthorsCursorByQuery */
        @MustBeClosed
        fun listAuthorsCursorByQuery(
            params: TagListAuthorsCursorByQueryParams = TagListAuthorsCursorByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listAuthorsCursorByQuery */
        @MustBeClosed
        fun listAuthorsCursorByQuery(
            params: TagListAuthorsCursorByQueryParams = TagListAuthorsCursorByQueryParams.none()
        ): HttpResponse = listAuthorsCursorByQuery(params, RequestOptions.none())

        /** @see listAuthorsCursorByQuery */
        @MustBeClosed
        fun listAuthorsCursorByQuery(requestOptions: RequestOptions): HttpResponse =
            listAuthorsCursorByQuery(TagListAuthorsCursorByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor`, but is otherwise
         * the same as [TagService.listCursor].
         */
        @MustBeClosed fun listCursor(): HttpResponse = listCursor(TagListCursorParams.none())

        /** @see listCursor */
        @MustBeClosed
        fun listCursor(
            params: TagListCursorParams = TagListCursorParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listCursor */
        @MustBeClosed
        fun listCursor(params: TagListCursorParams = TagListCursorParams.none()): HttpResponse =
            listCursor(params, RequestOptions.none())

        /** @see listCursor */
        @MustBeClosed
        fun listCursor(requestOptions: RequestOptions): HttpResponse =
            listCursor(TagListCursorParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor/query`, but is
         * otherwise the same as [TagService.listCursorByQuery].
         */
        @MustBeClosed
        fun listCursorByQuery(): HttpResponse = listCursorByQuery(TagListCursorByQueryParams.none())

        /** @see listCursorByQuery */
        @MustBeClosed
        fun listCursorByQuery(
            params: TagListCursorByQueryParams = TagListCursorByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listCursorByQuery */
        @MustBeClosed
        fun listCursorByQuery(
            params: TagListCursorByQueryParams = TagListCursorByQueryParams.none()
        ): HttpResponse = listCursorByQuery(params, RequestOptions.none())

        /** @see listCursorByQuery */
        @MustBeClosed
        fun listCursorByQuery(requestOptions: RequestOptions): HttpResponse =
            listCursorByQuery(TagListCursorByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor`, but is otherwise
         * the same as [TagService.listPostsCursor].
         */
        @MustBeClosed
        fun listPostsCursor(): HttpResponse = listPostsCursor(TagListPostsCursorParams.none())

        /** @see listPostsCursor */
        @MustBeClosed
        fun listPostsCursor(
            params: TagListPostsCursorParams = TagListPostsCursorParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listPostsCursor */
        @MustBeClosed
        fun listPostsCursor(
            params: TagListPostsCursorParams = TagListPostsCursorParams.none()
        ): HttpResponse = listPostsCursor(params, RequestOptions.none())

        /** @see listPostsCursor */
        @MustBeClosed
        fun listPostsCursor(requestOptions: RequestOptions): HttpResponse =
            listPostsCursor(TagListPostsCursorParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor/query`, but is
         * otherwise the same as [TagService.listPostsCursorByQuery].
         */
        @MustBeClosed
        fun listPostsCursorByQuery(): HttpResponse =
            listPostsCursorByQuery(TagListPostsCursorByQueryParams.none())

        /** @see listPostsCursorByQuery */
        @MustBeClosed
        fun listPostsCursorByQuery(
            params: TagListPostsCursorByQueryParams = TagListPostsCursorByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see listPostsCursorByQuery */
        @MustBeClosed
        fun listPostsCursorByQuery(
            params: TagListPostsCursorByQueryParams = TagListPostsCursorByQueryParams.none()
        ): HttpResponse = listPostsCursorByQuery(params, RequestOptions.none())

        /** @see listPostsCursorByQuery */
        @MustBeClosed
        fun listPostsCursorByQuery(requestOptions: RequestOptions): HttpResponse =
            listPostsCursorByQuery(TagListPostsCursorByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /cms/blogs/2026-03/tags/multi-language/set-new-lang-primary`, but is otherwise the same
         * as [TagService.setLangPrimary].
         */
        @MustBeClosed
        fun setLangPrimary(params: TagSetLangPrimaryParams): HttpResponse =
            setLangPrimary(params, RequestOptions.none())

        /** @see setLangPrimary */
        @MustBeClosed
        fun setLangPrimary(
            params: TagSetLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see setLangPrimary */
        @MustBeClosed
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            setLangPrimary(
                TagSetLangPrimaryParams.builder()
                    .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see setLangPrimary */
        @MustBeClosed
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ): HttpResponse = setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/tags/multi-language/update-languages`, but is otherwise the same as
         * [TagService.updateLangs].
         */
        @MustBeClosed
        fun updateLangs(params: TagUpdateLangsParams): HttpResponse =
            updateLangs(params, RequestOptions.none())

        /** @see updateLangs */
        @MustBeClosed
        fun updateLangs(
            params: TagUpdateLangsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateLangs */
        @MustBeClosed
        fun updateLangs(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLangs(
                TagUpdateLangsParams.builder()
                    .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see updateLangs */
        @MustBeClosed
        fun updateLangs(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext): HttpResponse =
            updateLangs(updateLanguagesRequestVNext, RequestOptions.none())
    }
}
