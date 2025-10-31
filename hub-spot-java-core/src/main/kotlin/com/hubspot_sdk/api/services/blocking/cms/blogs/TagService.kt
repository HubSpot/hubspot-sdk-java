// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListPage
import com.hubspot_sdk.api.models.cms.blogs.tags.TagListParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagSetLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateLangsParams
import com.hubspot_sdk.api.models.cms.blogs.tags.TagUpdateParams
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

    /** Create a new Blog Tag. */
    fun create(params: TagCreateParams): Tag = create(params, RequestOptions.none())

    /** @see create */
    fun create(params: TagCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Tag

    /** @see create */
    fun create(tag: Tag, requestOptions: RequestOptions = RequestOptions.none()): Tag =
        create(TagCreateParams.builder().tag(tag).build(), requestOptions)

    /** @see create */
    fun create(tag: Tag): Tag = create(tag, RequestOptions.none())

    /**
     * Sparse updates a single Blog Tag object identified by the id in the path. All the column
     * values need not be specified. Only the that need to be modified can be specified.
     */
    fun update(objectId: String, params: TagUpdateParams): Tag =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: TagUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tag = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: TagUpdateParams): Tag = update(params, RequestOptions.none())

    /** @see update */
    fun update(params: TagUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Tag

    /**
     * Get the list of blog tags. Supports paging and filtering. This method would be useful for an
     * integration that examined these models and used an external service to suggest edits.
     */
    fun list(): TagListPage = list(TagListParams.none())

    /** @see list */
    fun list(
        params: TagListParams = TagListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TagListPage

    /** @see list */
    fun list(params: TagListParams = TagListParams.none()): TagListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TagListPage =
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
    fun attachToLangGroup(params: TagAttachToLangGroupParams) =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: TagAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        attachToLangGroup(
            TagAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext) =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create the Blog Tag objects detailed in the request body. */
    fun createBatch(params: TagCreateBatchParams): BatchResponseTag =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: TagCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseTag

    /** @see createBatch */
    fun createBatch(
        batchInputTag: BatchInputTag,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseTag =
        createBatch(
            TagCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
            requestOptions,
        )

    /** @see createBatch */
    fun createBatch(batchInputTag: BatchInputTag): BatchResponseTag =
        createBatch(batchInputTag, RequestOptions.none())

    /** Create a new language variation from an existing Blog Tag */
    fun createLangVariation(params: TagCreateLangVariationParams): Tag =
        createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    fun createLangVariation(
        params: TagCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tag

    /** @see createLangVariation */
    fun createLangVariation(
        tagCloneRequestVNext: TagCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tag =
        createLangVariation(
            TagCreateLangVariationParams.builder()
                .tagCloneRequestVNext(tagCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    fun createLangVariation(tagCloneRequestVNext: TagCloneRequestVNext): Tag =
        createLangVariation(tagCloneRequestVNext, RequestOptions.none())

    /** Delete the Blog Tag objects identified in the request body. */
    fun deleteBatch(params: TagDeleteBatchParams) = deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: TagDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        deleteBatch(
            TagDeleteBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteBatch */
    fun deleteBatch(batchInputString: BatchInputString) =
        deleteBatch(batchInputString, RequestOptions.none())

    /** Detach a Blog Tag from a multi-language group. */
    fun detachFromLangGroup(params: TagDetachFromLangGroupParams) =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: TagDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        detachFromLangGroup(
            TagDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext) =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the Blog Tag object identified by the id in the path. */
    fun get(objectId: String): Tag = get(objectId, TagGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: TagGetParams = TagGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Tag = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(objectId: String, params: TagGetParams = TagGetParams.none()): Tag =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(params: TagGetParams, requestOptions: RequestOptions = RequestOptions.none()): Tag

    /** @see get */
    fun get(params: TagGetParams): Tag = get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): Tag =
        get(objectId, TagGetParams.none(), requestOptions)

    /** Retrieve the Blog Tag objects identified in the request body. */
    fun getBatch(params: TagGetBatchParams): BatchResponseTag =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: TagGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseTag

    /** @see getBatch */
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseTag =
        getBatch(
            TagGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    fun getBatch(batchInputString: BatchInputString): BatchResponseTag =
        getBatch(batchInputString, RequestOptions.none())

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

    /** Update the Blog Tag objects identified in the request body. */
    fun updateBatch(params: TagUpdateBatchParams): BatchResponseTag =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: TagUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseTag

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BatchResponseTag =
        updateBatch(
            TagUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): BatchResponseTag =
        updateBatch(batchInputJsonNode, RequestOptions.none())

    /** Explicitly set new languages for each Blog Tag in a multi-language group. */
    fun updateLangs(params: TagUpdateLangsParams) = updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    fun updateLangs(
        params: TagUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        updateLangs(
            TagUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    fun updateLangs(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext) =
        updateLangs(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [TagService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TagService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags`, but is otherwise the same as
         * [TagService.create].
         */
        @MustBeClosed
        fun create(params: TagCreateParams): HttpResponseFor<Tag> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: TagCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tag>

        /** @see create */
        @MustBeClosed
        fun create(
            tag: Tag,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tag> = create(TagCreateParams.builder().tag(tag).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(tag: Tag): HttpResponseFor<Tag> = create(tag, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/blogs/tags/{objectId}`, but is otherwise
         * the same as [TagService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: TagUpdateParams): HttpResponseFor<Tag> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tag> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: TagUpdateParams): HttpResponseFor<Tag> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: TagUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tag>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blogs/tags`, but is otherwise the same as
         * [TagService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<TagListPage> = list(TagListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TagListParams = TagListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TagListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: TagListParams = TagListParams.none()): HttpResponseFor<TagListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TagListPage> =
            list(TagListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/blogs/tags/{objectId}`, but is otherwise
         * the same as [TagService.delete].
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
         * /cms/v3/blogs/tags/multi-language/attach-to-lang-group`, but is otherwise the same as
         * [TagService.attachToLangGroup].
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags/batch/create`, but is otherwise
         * the same as [TagService.createBatch].
         */
        @MustBeClosed
        fun createBatch(params: TagCreateBatchParams): HttpResponseFor<BatchResponseTag> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            params: TagCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseTag>

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            batchInputTag: BatchInputTag,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseTag> =
            createBatch(
                TagCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
                requestOptions,
            )

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(batchInputTag: BatchInputTag): HttpResponseFor<BatchResponseTag> =
            createBatch(batchInputTag, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/tags/multi-language/create-language-variation`, but is otherwise the same
         * as [TagService.createLangVariation].
         */
        @MustBeClosed
        fun createLangVariation(params: TagCreateLangVariationParams): HttpResponseFor<Tag> =
            createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            params: TagCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tag>

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            tagCloneRequestVNext: TagCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tag> =
            createLangVariation(
                TagCreateLangVariationParams.builder()
                    .tagCloneRequestVNext(tagCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(tagCloneRequestVNext: TagCloneRequestVNext): HttpResponseFor<Tag> =
            createLangVariation(tagCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags/batch/archive`, but is otherwise
         * the same as [TagService.deleteBatch].
         */
        @MustBeClosed
        fun deleteBatch(params: TagDeleteBatchParams): HttpResponse =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            params: TagDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            deleteBatch(
                TagDeleteBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteBatch */
        @MustBeClosed
        fun deleteBatch(batchInputString: BatchInputString): HttpResponse =
            deleteBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/tags/multi-language/detach-from-lang-group`, but is otherwise the same as
         * [TagService.detachFromLangGroup].
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
         * Returns a raw HTTP response for `get /cms/v3/blogs/tags/{objectId}`, but is otherwise the
         * same as [TagService.get].
         */
        @MustBeClosed
        fun get(objectId: String): HttpResponseFor<Tag> = get(objectId, TagGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: TagGetParams = TagGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tag> = get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: TagGetParams = TagGetParams.none(),
        ): HttpResponseFor<Tag> = get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: TagGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Tag>

        /** @see get */
        @MustBeClosed
        fun get(params: TagGetParams): HttpResponseFor<Tag> = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponseFor<Tag> =
            get(objectId, TagGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags/batch/read`, but is otherwise
         * the same as [TagService.getBatch].
         */
        @MustBeClosed
        fun getBatch(params: TagGetBatchParams): HttpResponseFor<BatchResponseTag> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            params: TagGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseTag>

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseTag> =
            getBatch(
                TagGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(batchInputString: BatchInputString): HttpResponseFor<BatchResponseTag> =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/blogs/tags/multi-language/set-new-lang-primary`, but is otherwise the same as
         * [TagService.setLangPrimary].
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/tags/batch/update`, but is otherwise
         * the same as [TagService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(params: TagUpdateBatchParams): HttpResponseFor<BatchResponseTag> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: TagUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseTag>

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BatchResponseTag> =
            updateBatch(
                TagUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(batchInputJsonNode: BatchInputJsonNode): HttpResponseFor<BatchResponseTag> =
            updateBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/tags/multi-language/update-languages`, but is otherwise the same as
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
