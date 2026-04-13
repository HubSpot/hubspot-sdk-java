// File generated from our OpenAPI spec by Stainless.

package com.hubspot.services.async.cms.blogs

import com.hubspot.core.ClientOptions
import com.hubspot.core.RequestOptions
import com.hubspot.core.http.HttpResponse
import com.hubspot.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot.models.cms.UpdateLanguagesRequestVNext
import com.hubspot.models.cms.blogs.tags.Tag
import com.hubspot.models.cms.blogs.tags.TagAttachToLangGroupParams
import com.hubspot.models.cms.blogs.tags.TagCloneRequestVNext
import com.hubspot.models.cms.blogs.tags.TagCreateLangVariationParams
import com.hubspot.models.cms.blogs.tags.TagCreateParams
import com.hubspot.models.cms.blogs.tags.TagDeleteParams
import com.hubspot.models.cms.blogs.tags.TagDetachFromLangGroupParams
import com.hubspot.models.cms.blogs.tags.TagGetParams
import com.hubspot.models.cms.blogs.tags.TagListAuthorsCursorByQueryParams
import com.hubspot.models.cms.blogs.tags.TagListAuthorsCursorParams
import com.hubspot.models.cms.blogs.tags.TagListCursorByQueryParams
import com.hubspot.models.cms.blogs.tags.TagListCursorParams
import com.hubspot.models.cms.blogs.tags.TagListParams
import com.hubspot.models.cms.blogs.tags.TagListPostsCursorByQueryParams
import com.hubspot.models.cms.blogs.tags.TagListPostsCursorParams
import com.hubspot.models.cms.blogs.tags.TagSetLangPrimaryParams
import com.hubspot.models.cms.blogs.tags.TagUpdateLangsParams
import com.hubspot.models.cms.blogs.tags.TagUpdateParams
import com.hubspot.services.async.cms.blogs.tags.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TagServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync

    fun batch(): BatchServiceAsync

    /** Create a new Blog Tag. */
    fun create(params: TagCreateParams): CompletableFuture<HttpResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see create */
    fun create(
        tag: Tag,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        create(TagCreateParams.builder().tag(tag).build(), requestOptions)

    /** @see create */
    fun create(tag: Tag): CompletableFuture<HttpResponse> = create(tag, RequestOptions.none())

    /**
     * Sparse updates a single Blog Tag object identified by the id in the path. All the column
     * values need not be specified. Only the that need to be modified can be specified.
     */
    fun update(objectId: String, params: TagUpdateParams): CompletableFuture<HttpResponse> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: TagUpdateParams): CompletableFuture<HttpResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /**
     * Get the list of blog tags. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    fun list(): CompletableFuture<HttpResponse> = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): CompletableFuture<HttpResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        list(TagListParams.none(), requestOptions)

    /** Delete the Blog Tag object identified by the id in the path. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, TagDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: TagDeleteParams = TagDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: TagDeleteParams = TagDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: TagDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: TagDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, TagDeleteParams.none(), requestOptions)

    /** Attach a Blog Tag to a multi-language group. */
    fun attachToLangGroup(params: TagAttachToLangGroupParams): CompletableFuture<HttpResponse> =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: TagAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(
            TagAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create a new language variation from an existing Blog Tag */
    fun createLangVariation(params: TagCreateLangVariationParams): CompletableFuture<HttpResponse> =
        createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    fun createLangVariation(
        params: TagCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see createLangVariation */
    fun createLangVariation(
        tagCloneRequestVNext: TagCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        createLangVariation(
            TagCreateLangVariationParams.builder()
                .tagCloneRequestVNext(tagCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    fun createLangVariation(
        tagCloneRequestVNext: TagCloneRequestVNext
    ): CompletableFuture<HttpResponse> =
        createLangVariation(tagCloneRequestVNext, RequestOptions.none())

    /** Detach a Blog Tag from a multi-language group. */
    fun detachFromLangGroup(params: TagDetachFromLangGroupParams): CompletableFuture<HttpResponse> =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: TagDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(
            TagDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the Blog Tag object identified by the id in the path. */
    fun get(objectId: String): CompletableFuture<HttpResponse> = get(objectId, TagGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: TagGetParams = TagGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: TagGetParams = TagGetParams.none(),
    ): CompletableFuture<HttpResponse> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see get */
    fun get(params: TagGetParams): CompletableFuture<HttpResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        get(objectId, TagGetParams.none(), requestOptions)

    fun listAuthorsCursor(): CompletableFuture<HttpResponse> =
        listAuthorsCursor(TagListAuthorsCursorParams.none())

    /** @see listAuthorsCursor */
    fun listAuthorsCursor(
        params: TagListAuthorsCursorParams = TagListAuthorsCursorParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listAuthorsCursor */
    fun listAuthorsCursor(
        params: TagListAuthorsCursorParams = TagListAuthorsCursorParams.none()
    ): CompletableFuture<HttpResponse> = listAuthorsCursor(params, RequestOptions.none())

    /** @see listAuthorsCursor */
    fun listAuthorsCursor(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listAuthorsCursor(TagListAuthorsCursorParams.none(), requestOptions)

    fun listAuthorsCursorByQuery(): CompletableFuture<HttpResponse> =
        listAuthorsCursorByQuery(TagListAuthorsCursorByQueryParams.none())

    /** @see listAuthorsCursorByQuery */
    fun listAuthorsCursorByQuery(
        params: TagListAuthorsCursorByQueryParams = TagListAuthorsCursorByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listAuthorsCursorByQuery */
    fun listAuthorsCursorByQuery(
        params: TagListAuthorsCursorByQueryParams = TagListAuthorsCursorByQueryParams.none()
    ): CompletableFuture<HttpResponse> = listAuthorsCursorByQuery(params, RequestOptions.none())

    /** @see listAuthorsCursorByQuery */
    fun listAuthorsCursorByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listAuthorsCursorByQuery(TagListAuthorsCursorByQueryParams.none(), requestOptions)

    fun listCursor(): CompletableFuture<HttpResponse> = listCursor(TagListCursorParams.none())

    /** @see listCursor */
    fun listCursor(
        params: TagListCursorParams = TagListCursorParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listCursor */
    fun listCursor(
        params: TagListCursorParams = TagListCursorParams.none()
    ): CompletableFuture<HttpResponse> = listCursor(params, RequestOptions.none())

    /** @see listCursor */
    fun listCursor(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listCursor(TagListCursorParams.none(), requestOptions)

    fun listCursorByQuery(): CompletableFuture<HttpResponse> =
        listCursorByQuery(TagListCursorByQueryParams.none())

    /** @see listCursorByQuery */
    fun listCursorByQuery(
        params: TagListCursorByQueryParams = TagListCursorByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listCursorByQuery */
    fun listCursorByQuery(
        params: TagListCursorByQueryParams = TagListCursorByQueryParams.none()
    ): CompletableFuture<HttpResponse> = listCursorByQuery(params, RequestOptions.none())

    /** @see listCursorByQuery */
    fun listCursorByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listCursorByQuery(TagListCursorByQueryParams.none(), requestOptions)

    fun listPostsCursor(): CompletableFuture<HttpResponse> =
        listPostsCursor(TagListPostsCursorParams.none())

    /** @see listPostsCursor */
    fun listPostsCursor(
        params: TagListPostsCursorParams = TagListPostsCursorParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listPostsCursor */
    fun listPostsCursor(
        params: TagListPostsCursorParams = TagListPostsCursorParams.none()
    ): CompletableFuture<HttpResponse> = listPostsCursor(params, RequestOptions.none())

    /** @see listPostsCursor */
    fun listPostsCursor(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listPostsCursor(TagListPostsCursorParams.none(), requestOptions)

    fun listPostsCursorByQuery(): CompletableFuture<HttpResponse> =
        listPostsCursorByQuery(TagListPostsCursorByQueryParams.none())

    /** @see listPostsCursorByQuery */
    fun listPostsCursorByQuery(
        params: TagListPostsCursorByQueryParams = TagListPostsCursorByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listPostsCursorByQuery */
    fun listPostsCursorByQuery(
        params: TagListPostsCursorByQueryParams = TagListPostsCursorByQueryParams.none()
    ): CompletableFuture<HttpResponse> = listPostsCursorByQuery(params, RequestOptions.none())

    /** @see listPostsCursorByQuery */
    fun listPostsCursorByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listPostsCursorByQuery(TagListPostsCursorByQueryParams.none(), requestOptions)

    /** Set a Blog Tag as the primary language of a multi-language group. */
    fun setLangPrimary(params: TagSetLangPrimaryParams): CompletableFuture<Void?> =
        setLangPrimary(params, RequestOptions.none())

    /** @see setLangPrimary */
    fun setLangPrimary(
        params: TagSetLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see setLangPrimary */
    fun setLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        setLangPrimary(
            TagSetLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setLangPrimary */
    fun setLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
    ): CompletableFuture<Void?> =
        setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Explicitly set new languages for each Blog Tag in a multi-language group. */
    fun updateLangs(params: TagUpdateLangsParams): CompletableFuture<HttpResponse> =
        updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    fun updateLangs(
        params: TagUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        updateLangs(
            TagUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
    ): CompletableFuture<HttpResponse> =
        updateLangs(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [TagServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags`, but is otherwise the same
         * as [TagServiceAsync.create].
         */
        fun create(params: TagCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            tag: Tag,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(TagCreateParams.builder().tag(tag).build(), requestOptions)

        /** @see create */
        fun create(tag: Tag): CompletableFuture<HttpResponse> = create(tag, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/tags/{objectId}`, but is
         * otherwise the same as [TagServiceAsync.update].
         */
        fun update(objectId: String, params: TagUpdateParams): CompletableFuture<HttpResponse> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: TagUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags`, but is otherwise the same
         * as [TagServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(TagListParams.none())

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: TagListParams = TagListParams.none()): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/blogs/2026-03/tags/{objectId}`, but is
         * otherwise the same as [TagServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, TagDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: TagDeleteParams = TagDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: TagDeleteParams = TagDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: TagDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: TagDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, TagDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/tags/multi-language/attach-to-lang-group`, but is otherwise the same
         * as [TagServiceAsync.attachToLangGroup].
         */
        fun attachToLangGroup(params: TagAttachToLangGroupParams): CompletableFuture<HttpResponse> =
            attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            params: TagAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(
                TagAttachToLangGroupParams.builder()
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
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/tags/multi-language/create-language-variation`, but is otherwise the
         * same as [TagServiceAsync.createLangVariation].
         */
        fun createLangVariation(
            params: TagCreateLangVariationParams
        ): CompletableFuture<HttpResponse> = createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        fun createLangVariation(
            params: TagCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createLangVariation */
        fun createLangVariation(
            tagCloneRequestVNext: TagCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createLangVariation(
                TagCreateLangVariationParams.builder()
                    .tagCloneRequestVNext(tagCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLangVariation */
        fun createLangVariation(
            tagCloneRequestVNext: TagCloneRequestVNext
        ): CompletableFuture<HttpResponse> =
            createLangVariation(tagCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/tags/multi-language/detach-from-lang-group`, but is otherwise the same
         * as [TagServiceAsync.detachFromLangGroup].
         */
        fun detachFromLangGroup(
            params: TagDetachFromLangGroupParams
        ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            params: TagDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(
                TagDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/{objectId}`, but is
         * otherwise the same as [TagServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponse> =
            get(objectId, TagGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: TagGetParams = TagGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: TagGetParams = TagGetParams.none(),
        ): CompletableFuture<HttpResponse> = get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see get */
        fun get(params: TagGetParams): CompletableFuture<HttpResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            get(objectId, TagGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor`, but is otherwise
         * the same as [TagServiceAsync.listAuthorsCursor].
         */
        fun listAuthorsCursor(): CompletableFuture<HttpResponse> =
            listAuthorsCursor(TagListAuthorsCursorParams.none())

        /** @see listAuthorsCursor */
        fun listAuthorsCursor(
            params: TagListAuthorsCursorParams = TagListAuthorsCursorParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listAuthorsCursor */
        fun listAuthorsCursor(
            params: TagListAuthorsCursorParams = TagListAuthorsCursorParams.none()
        ): CompletableFuture<HttpResponse> = listAuthorsCursor(params, RequestOptions.none())

        /** @see listAuthorsCursor */
        fun listAuthorsCursor(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listAuthorsCursor(TagListAuthorsCursorParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor/query`, but is
         * otherwise the same as [TagServiceAsync.listAuthorsCursorByQuery].
         */
        fun listAuthorsCursorByQuery(): CompletableFuture<HttpResponse> =
            listAuthorsCursorByQuery(TagListAuthorsCursorByQueryParams.none())

        /** @see listAuthorsCursorByQuery */
        fun listAuthorsCursorByQuery(
            params: TagListAuthorsCursorByQueryParams = TagListAuthorsCursorByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listAuthorsCursorByQuery */
        fun listAuthorsCursorByQuery(
            params: TagListAuthorsCursorByQueryParams = TagListAuthorsCursorByQueryParams.none()
        ): CompletableFuture<HttpResponse> = listAuthorsCursorByQuery(params, RequestOptions.none())

        /** @see listAuthorsCursorByQuery */
        fun listAuthorsCursorByQuery(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponse> =
            listAuthorsCursorByQuery(TagListAuthorsCursorByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor`, but is otherwise
         * the same as [TagServiceAsync.listCursor].
         */
        fun listCursor(): CompletableFuture<HttpResponse> = listCursor(TagListCursorParams.none())

        /** @see listCursor */
        fun listCursor(
            params: TagListCursorParams = TagListCursorParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listCursor */
        fun listCursor(
            params: TagListCursorParams = TagListCursorParams.none()
        ): CompletableFuture<HttpResponse> = listCursor(params, RequestOptions.none())

        /** @see listCursor */
        fun listCursor(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listCursor(TagListCursorParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor/query`, but is
         * otherwise the same as [TagServiceAsync.listCursorByQuery].
         */
        fun listCursorByQuery(): CompletableFuture<HttpResponse> =
            listCursorByQuery(TagListCursorByQueryParams.none())

        /** @see listCursorByQuery */
        fun listCursorByQuery(
            params: TagListCursorByQueryParams = TagListCursorByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listCursorByQuery */
        fun listCursorByQuery(
            params: TagListCursorByQueryParams = TagListCursorByQueryParams.none()
        ): CompletableFuture<HttpResponse> = listCursorByQuery(params, RequestOptions.none())

        /** @see listCursorByQuery */
        fun listCursorByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listCursorByQuery(TagListCursorByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor`, but is otherwise
         * the same as [TagServiceAsync.listPostsCursor].
         */
        fun listPostsCursor(): CompletableFuture<HttpResponse> =
            listPostsCursor(TagListPostsCursorParams.none())

        /** @see listPostsCursor */
        fun listPostsCursor(
            params: TagListPostsCursorParams = TagListPostsCursorParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listPostsCursor */
        fun listPostsCursor(
            params: TagListPostsCursorParams = TagListPostsCursorParams.none()
        ): CompletableFuture<HttpResponse> = listPostsCursor(params, RequestOptions.none())

        /** @see listPostsCursor */
        fun listPostsCursor(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listPostsCursor(TagListPostsCursorParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor/query`, but is
         * otherwise the same as [TagServiceAsync.listPostsCursorByQuery].
         */
        fun listPostsCursorByQuery(): CompletableFuture<HttpResponse> =
            listPostsCursorByQuery(TagListPostsCursorByQueryParams.none())

        /** @see listPostsCursorByQuery */
        fun listPostsCursorByQuery(
            params: TagListPostsCursorByQueryParams = TagListPostsCursorByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listPostsCursorByQuery */
        fun listPostsCursorByQuery(
            params: TagListPostsCursorByQueryParams = TagListPostsCursorByQueryParams.none()
        ): CompletableFuture<HttpResponse> = listPostsCursorByQuery(params, RequestOptions.none())

        /** @see listPostsCursorByQuery */
        fun listPostsCursorByQuery(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponse> =
            listPostsCursorByQuery(TagListPostsCursorByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /cms/blogs/2026-03/tags/multi-language/set-new-lang-primary`, but is otherwise the same
         * as [TagServiceAsync.setLangPrimary].
         */
        fun setLangPrimary(params: TagSetLangPrimaryParams): CompletableFuture<HttpResponse> =
            setLangPrimary(params, RequestOptions.none())

        /** @see setLangPrimary */
        fun setLangPrimary(
            params: TagSetLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see setLangPrimary */
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            setLangPrimary(
                TagSetLangPrimaryParams.builder()
                    .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see setLangPrimary */
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ): CompletableFuture<HttpResponse> =
            setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/tags/multi-language/update-languages`, but is otherwise the same as
         * [TagServiceAsync.updateLangs].
         */
        fun updateLangs(params: TagUpdateLangsParams): CompletableFuture<HttpResponse> =
            updateLangs(params, RequestOptions.none())

        /** @see updateLangs */
        fun updateLangs(
            params: TagUpdateLangsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateLangs */
        fun updateLangs(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLangs(
                TagUpdateLangsParams.builder()
                    .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see updateLangs */
        fun updateLangs(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
        ): CompletableFuture<HttpResponse> =
            updateLangs(updateLanguagesRequestVNext, RequestOptions.none())
    }
}
