// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.tags.BatchInputTag
import com.hubspot_sdk.api.models.cms.blogs.tags.BatchResponseTag
import com.hubspot_sdk.api.models.cms.blogs.tags.Tag
import com.hubspot_sdk.api.models.cms.blogs.tags.TagAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCloneRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateLangVariationParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagCreateParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDeleteBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagGetBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagGetParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListPageAsync
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagSetLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateLangsParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateParams
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

    /** Create a new Blog Tag. */
    fun create(params: TagCreateParams): CompletableFuture<Tag> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: TagCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tag>

    /** @see create */
    fun create(
        tag: Tag,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tag> = create(TagCreateParams.builder().tag(tag).build(), requestOptions)

    /** @see create */
    fun create(tag: Tag): CompletableFuture<Tag> = create(tag, RequestOptions.none())

    /**
     * Sparse updates a single Blog Tag object identified by the id in the path. All the column
     * values need not be specified. Only the that need to be modified can be specified.
     */
    fun update(objectId: String, params: TagUpdateParams): CompletableFuture<Tag> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tag> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: TagUpdateParams): CompletableFuture<Tag> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tag>

    /**
     * Get the list of blog tags. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    fun list(): CompletableFuture<TagListPageAsync> = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TagListPageAsync>

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): CompletableFuture<TagListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TagListPageAsync> =
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
    fun attachToLangGroup(params: TagAttachToLangGroupParams): CompletableFuture<Void?> =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: TagAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        attachToLangGroup(
            TagAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<Void?> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create the Blog Tag objects detailed in the request body. */
    fun createBatch(params: TagCreateBatchParams): CompletableFuture<BatchResponseTag> =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: TagCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseTag>

    /** @see createBatch */
    fun createBatch(
        batchInputTag: BatchInputTag,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseTag> =
        createBatch(
            TagCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
            requestOptions,
        )

    /** @see createBatch */
    fun createBatch(batchInputTag: BatchInputTag): CompletableFuture<BatchResponseTag> =
        createBatch(batchInputTag, RequestOptions.none())

    /** Create a new language variation from an existing Blog Tag */
    fun createLangVariation(params: TagCreateLangVariationParams): CompletableFuture<Tag> =
        createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    fun createLangVariation(
        params: TagCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tag>

    /** @see createLangVariation */
    fun createLangVariation(
        tagCloneRequestVNext: TagCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tag> =
        createLangVariation(
            TagCreateLangVariationParams.builder()
                .tagCloneRequestVNext(tagCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    fun createLangVariation(tagCloneRequestVNext: TagCloneRequestVNext): CompletableFuture<Tag> =
        createLangVariation(tagCloneRequestVNext, RequestOptions.none())

    /** Delete the Blog Tag objects identified in the request body. */
    fun deleteBatch(params: TagDeleteBatchParams): CompletableFuture<Void?> =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: TagDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteBatch(
            TagDeleteBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteBatch */
    fun deleteBatch(batchInputString: BatchInputString): CompletableFuture<Void?> =
        deleteBatch(batchInputString, RequestOptions.none())

    /** Detach a Blog Tag from a multi-language group. */
    fun detachFromLangGroup(params: TagDetachFromLangGroupParams): CompletableFuture<Void?> =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: TagDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        detachFromLangGroup(
            TagDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<Void?> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the Blog Tag object identified by the id in the path. */
    fun get(objectId: String): CompletableFuture<Tag> = get(objectId, TagGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: TagGetParams = TagGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tag> = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: TagGetParams = TagGetParams.none()): CompletableFuture<Tag> =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: TagGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Tag>

    /** @see get */
    fun get(params: TagGetParams): CompletableFuture<Tag> = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<Tag> =
        get(objectId, TagGetParams.none(), requestOptions)

    /** Retrieve the Blog Tag objects identified in the request body. */
    fun getBatch(params: TagGetBatchParams): CompletableFuture<BatchResponseTag> =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: TagGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseTag>

    /** @see getBatch */
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseTag> =
        getBatch(
            TagGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    fun getBatch(batchInputString: BatchInputString): CompletableFuture<BatchResponseTag> =
        getBatch(batchInputString, RequestOptions.none())

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

    /** Update the Blog Tag objects identified in the request body. */
    fun updateBatch(params: TagUpdateBatchParams): CompletableFuture<BatchResponseTag> =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: TagUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseTag>

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseTag> =
        updateBatch(
            TagUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): CompletableFuture<BatchResponseTag> =
        updateBatch(batchInputJsonNode, RequestOptions.none())

    /** Explicitly set new languages for each Blog Tag in a multi-language group. */
    fun updateLangs(params: TagUpdateLangsParams): CompletableFuture<Void?> =
        updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    fun updateLangs(
        params: TagUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateLangs(
            TagUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
    ): CompletableFuture<Void?> = updateLangs(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [TagServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags`, but is otherwise the same as
         * [TagServiceAsync.create].
         */
        fun create(params: TagCreateParams): CompletableFuture<HttpResponseFor<Tag>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tag>>

        /** @see create */
        fun create(
            tag: Tag,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tag>> =
            create(TagCreateParams.builder().tag(tag).build(), requestOptions)

        /** @see create */
        fun create(tag: Tag): CompletableFuture<HttpResponseFor<Tag>> =
            create(tag, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/blogs/tags/{objectId}`, but is otherwise
         * the same as [TagServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: TagUpdateParams,
        ): CompletableFuture<HttpResponseFor<Tag>> = update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tag>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: TagUpdateParams): CompletableFuture<HttpResponseFor<Tag>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tag>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blogs/tags`, but is otherwise the same as
         * [TagServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TagListPageAsync>> =
            list(TagListParams.none())

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TagListPageAsync>>

        /** @see list */
        fun list(
            params: TagListParams = TagListParams.none()
        ): CompletableFuture<HttpResponseFor<TagListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TagListPageAsync>> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/blogs/tags/{objectId}`, but is otherwise
         * the same as [TagServiceAsync.delete].
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
         * /cms/v3/blogs/tags/multi-language/attach-to-lang-group`, but is otherwise the same as
         * [TagServiceAsync.attachToLangGroup].
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags/batch/create`, but is otherwise
         * the same as [TagServiceAsync.createBatch].
         */
        fun createBatch(
            params: TagCreateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            params: TagCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>>

        /** @see createBatch */
        fun createBatch(
            batchInputTag: BatchInputTag,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>> =
            createBatch(
                TagCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
                requestOptions,
            )

        /** @see createBatch */
        fun createBatch(
            batchInputTag: BatchInputTag
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>> =
            createBatch(batchInputTag, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/tags/multi-language/create-language-variation`, but is otherwise the same
         * as [TagServiceAsync.createLangVariation].
         */
        fun createLangVariation(
            params: TagCreateLangVariationParams
        ): CompletableFuture<HttpResponseFor<Tag>> =
            createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        fun createLangVariation(
            params: TagCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tag>>

        /** @see createLangVariation */
        fun createLangVariation(
            tagCloneRequestVNext: TagCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tag>> =
            createLangVariation(
                TagCreateLangVariationParams.builder()
                    .tagCloneRequestVNext(tagCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLangVariation */
        fun createLangVariation(
            tagCloneRequestVNext: TagCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<Tag>> =
            createLangVariation(tagCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags/batch/archive`, but is otherwise
         * the same as [TagServiceAsync.deleteBatch].
         */
        fun deleteBatch(params: TagDeleteBatchParams): CompletableFuture<HttpResponse> =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        fun deleteBatch(
            params: TagDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteBatch */
        fun deleteBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteBatch(
                TagDeleteBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteBatch */
        fun deleteBatch(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
            deleteBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/tags/multi-language/detach-from-lang-group`, but is otherwise the same as
         * [TagServiceAsync.detachFromLangGroup].
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
         * Returns a raw HTTP response for `get /cms/v3/blogs/tags/{objectId}`, but is otherwise the
         * same as [TagServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<Tag>> =
            get(objectId, TagGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: TagGetParams = TagGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tag>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: TagGetParams = TagGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Tag>> = get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: TagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Tag>>

        /** @see get */
        fun get(params: TagGetParams): CompletableFuture<HttpResponseFor<Tag>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Tag>> =
            get(objectId, TagGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags/batch/read`, but is otherwise
         * the same as [TagServiceAsync.getBatch].
         */
        fun getBatch(
            params: TagGetBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        fun getBatch(
            params: TagGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>>

        /** @see getBatch */
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>> =
            getBatch(
                TagGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        fun getBatch(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>> =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/blogs/tags/multi-language/set-new-lang-primary`, but is otherwise the same as
         * [TagServiceAsync.setLangPrimary].
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags/batch/update`, but is otherwise
         * the same as [TagServiceAsync.updateBatch].
         */
        fun updateBatch(
            params: TagUpdateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: TagUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>>

        /** @see updateBatch */
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>> =
            updateBatch(
                TagUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateBatch */
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode
        ): CompletableFuture<HttpResponseFor<BatchResponseTag>> =
            updateBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/tags/multi-language/update-languages`, but is otherwise the same as
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
