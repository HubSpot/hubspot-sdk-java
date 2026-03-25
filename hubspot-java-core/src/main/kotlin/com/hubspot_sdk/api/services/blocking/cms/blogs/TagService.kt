// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.BatchInputString
import com.hubspot_sdk.api.models.cms.blogs.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.BatchInputJsonNode
import com.hubspot_sdk.api.models.cms.blogs.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.tags.BatchInputTag
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

    @MustBeClosed
    fun createBatch(params: TagCreateBatchParams): HttpResponse =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    @MustBeClosed
    fun createBatch(
        params: TagCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see createBatch */
    @MustBeClosed
    fun createBatch(
        batchInputTag: BatchInputTag,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        createBatch(
            TagCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
            requestOptions,
        )

    /** @see createBatch */
    @MustBeClosed
    fun createBatch(batchInputTag: BatchInputTag): HttpResponse =
        createBatch(batchInputTag, RequestOptions.none())

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
    fun getBatch(params: TagGetBatchParams): HttpResponse = getBatch(params, RequestOptions.none())

    /** @see getBatch */
    @MustBeClosed
    fun getBatch(
        params: TagGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getBatch */
    @MustBeClosed
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getBatch(
            TagGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    @MustBeClosed
    fun getBatch(batchInputString: BatchInputString): HttpResponse =
        getBatch(batchInputString, RequestOptions.none())

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

    @MustBeClosed
    fun updateBatch(params: TagUpdateBatchParams): HttpResponse =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    @MustBeClosed
    fun updateBatch(
        params: TagUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see updateBatch */
    @MustBeClosed
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        updateBatch(
            TagUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    @MustBeClosed
    fun updateBatch(batchInputJsonNode: BatchInputJsonNode): HttpResponse =
        updateBatch(batchInputJsonNode, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/create`, but is
         * otherwise the same as [TagService.createBatch].
         */
        @MustBeClosed
        fun createBatch(params: TagCreateBatchParams): HttpResponse =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            params: TagCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(
            batchInputTag: BatchInputTag,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createBatch(
                TagCreateBatchParams.builder().batchInputTag(batchInputTag).build(),
                requestOptions,
            )

        /** @see createBatch */
        @MustBeClosed
        fun createBatch(batchInputTag: BatchInputTag): HttpResponse =
            createBatch(batchInputTag, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/archive`, but is
         * otherwise the same as [TagService.deleteBatch].
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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/read`, but is
         * otherwise the same as [TagService.getBatch].
         */
        @MustBeClosed
        fun getBatch(params: TagGetBatchParams): HttpResponse =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            params: TagGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getBatch(
                TagGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        @MustBeClosed
        fun getBatch(batchInputString: BatchInputString): HttpResponse =
            getBatch(batchInputString, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/tags/batch/update`, but is
         * otherwise the same as [TagService.updateBatch].
         */
        @MustBeClosed
        fun updateBatch(params: TagUpdateBatchParams): HttpResponse =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            params: TagUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateBatch(
                TagUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateBatch */
        @MustBeClosed
        fun updateBatch(batchInputJsonNode: BatchInputJsonNode): HttpResponse =
            updateBatch(batchInputJsonNode, RequestOptions.none())

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
