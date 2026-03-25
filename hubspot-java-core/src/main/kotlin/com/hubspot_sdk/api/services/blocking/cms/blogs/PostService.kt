// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.cms.blogs.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.posts.BlogPost
import com.hubspot_sdk.api.models.cms.blogs.posts.BlogPostLanguageCloneRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.posts.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.posts.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.posts.PostAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCloneParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCreateLangVariationParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCreateParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetDraftByIdParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostListParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostPushLiveParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostResetDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostRestorePreviousVersionParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostRestorePreviousVersionToDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostScheduleParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostSetLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateLangsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateParams
import com.hubspot_sdk.api.services.blocking.cms.blogs.posts.BatchService
import java.util.function.Consumer

interface PostService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostService

    fun batch(): BatchService

    @MustBeClosed
    fun create(params: PostCreateParams): HttpResponse = create(params, RequestOptions.none())

    /** @see create */
    @MustBeClosed
    fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see create */
    @MustBeClosed
    fun create(
        blogPost: BlogPost,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

    /** @see create */
    @MustBeClosed
    fun create(blogPost: BlogPost): HttpResponse = create(blogPost, RequestOptions.none())

    @MustBeClosed
    fun update(objectId: String, params: PostUpdateParams): HttpResponse =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    @MustBeClosed
    fun update(
        objectId: String,
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    @MustBeClosed
    fun update(params: PostUpdateParams): HttpResponse = update(params, RequestOptions.none())

    /** @see update */
    @MustBeClosed
    fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    @MustBeClosed fun list(): HttpResponse = list(PostListParams.none())

    /** @see list */
    @MustBeClosed
    fun list(
        params: PostListParams = PostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see list */
    @MustBeClosed
    fun list(params: PostListParams = PostListParams.none()): HttpResponse =
        list(params, RequestOptions.none())

    /** @see list */
    @MustBeClosed
    fun list(requestOptions: RequestOptions): HttpResponse =
        list(PostListParams.none(), requestOptions)

    fun delete(objectId: String) = delete(objectId, PostDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: PostDeleteParams = PostDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(objectId: String, params: PostDeleteParams = PostDeleteParams.none()) =
        delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(params: PostDeleteParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see delete */
    fun delete(params: PostDeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions) =
        delete(objectId, PostDeleteParams.none(), requestOptions)

    @MustBeClosed
    fun attachToLangGroup(params: PostAttachToLangGroupParams): HttpResponse =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        params: PostAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        attachToLangGroup(
            PostAttachToLangGroupParams.builder()
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
    fun clone(params: PostCloneParams): HttpResponse = clone(params, RequestOptions.none())

    /** @see clone */
    @MustBeClosed
    fun clone(
        params: PostCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see clone */
    @MustBeClosed
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        clone(
            PostCloneParams.builder().contentCloneRequestVNext(contentCloneRequestVNext).build(),
            requestOptions,
        )

    /** @see clone */
    @MustBeClosed
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponse =
        clone(contentCloneRequestVNext, RequestOptions.none())

    @MustBeClosed
    fun createLangVariation(params: PostCreateLangVariationParams): HttpResponse =
        createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    @MustBeClosed
    fun createLangVariation(
        params: PostCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see createLangVariation */
    @MustBeClosed
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        createLangVariation(
            PostCreateLangVariationParams.builder()
                .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    @MustBeClosed
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
    ): HttpResponse = createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

    @MustBeClosed
    fun detachFromLangGroup(params: PostDetachFromLangGroupParams): HttpResponse =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        params: PostDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        detachFromLangGroup(
            PostDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): HttpResponse = detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    @MustBeClosed fun get(objectId: String): HttpResponse = get(objectId, PostGetParams.none())

    /** @see get */
    @MustBeClosed
    fun get(
        objectId: String,
        params: PostGetParams = PostGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    @MustBeClosed
    fun get(objectId: String, params: PostGetParams = PostGetParams.none()): HttpResponse =
        get(objectId, params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(
        params: PostGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see get */
    @MustBeClosed fun get(params: PostGetParams): HttpResponse = get(params, RequestOptions.none())

    /** @see get */
    @MustBeClosed
    fun get(objectId: String, requestOptions: RequestOptions): HttpResponse =
        get(objectId, PostGetParams.none(), requestOptions)

    @MustBeClosed
    fun getDraftById(objectId: String): HttpResponse =
        getDraftById(objectId, PostGetDraftByIdParams.none())

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
    ): HttpResponse = getDraftById(objectId, params, RequestOptions.none())

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(
        params: PostGetDraftByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(params: PostGetDraftByIdParams): HttpResponse =
        getDraftById(params, RequestOptions.none())

    /** @see getDraftById */
    @MustBeClosed
    fun getDraftById(objectId: String, requestOptions: RequestOptions): HttpResponse =
        getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

    @MustBeClosed
    fun getPreviousVersion(revisionId: String, params: PostGetPreviousVersionParams): HttpResponse =
        getPreviousVersion(revisionId, params, RequestOptions.none())

    /** @see getPreviousVersion */
    @MustBeClosed
    fun getPreviousVersion(
        revisionId: String,
        params: PostGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getPreviousVersion */
    @MustBeClosed
    fun getPreviousVersion(params: PostGetPreviousVersionParams): HttpResponse =
        getPreviousVersion(params, RequestOptions.none())

    /** @see getPreviousVersion */
    @MustBeClosed
    fun getPreviousVersion(
        params: PostGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    @MustBeClosed
    fun getPreviousVersions(objectId: String): HttpResponse =
        getPreviousVersions(objectId, PostGetPreviousVersionsParams.none())

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(
        objectId: String,
        params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(
        objectId: String,
        params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
    ): HttpResponse = getPreviousVersions(objectId, params, RequestOptions.none())

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(
        params: PostGetPreviousVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(params: PostGetPreviousVersionsParams): HttpResponse =
        getPreviousVersions(params, RequestOptions.none())

    /** @see getPreviousVersions */
    @MustBeClosed
    fun getPreviousVersions(objectId: String, requestOptions: RequestOptions): HttpResponse =
        getPreviousVersions(objectId, PostGetPreviousVersionsParams.none(), requestOptions)

    fun pushLive(objectId: String) = pushLive(objectId, PostPushLiveParams.none())

    /** @see pushLive */
    fun pushLive(
        objectId: String,
        params: PostPushLiveParams = PostPushLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pushLive */
    fun pushLive(objectId: String, params: PostPushLiveParams = PostPushLiveParams.none()) =
        pushLive(objectId, params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(params: PostPushLiveParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see pushLive */
    fun pushLive(params: PostPushLiveParams) = pushLive(params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(objectId: String, requestOptions: RequestOptions) =
        pushLive(objectId, PostPushLiveParams.none(), requestOptions)

    fun resetDraft(objectId: String) = resetDraft(objectId, PostResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: PostResetDraftParams = PostResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(objectId: String, params: PostResetDraftParams = PostResetDraftParams.none()) =
        resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: PostResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see resetDraft */
    fun resetDraft(params: PostResetDraftParams) = resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions) =
        resetDraft(objectId, PostResetDraftParams.none(), requestOptions)

    @MustBeClosed
    fun restorePreviousVersion(
        revisionId: String,
        params: PostRestorePreviousVersionParams,
    ): HttpResponse = restorePreviousVersion(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersion */
    @MustBeClosed
    fun restorePreviousVersion(
        revisionId: String,
        params: PostRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        restorePreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restorePreviousVersion */
    @MustBeClosed
    fun restorePreviousVersion(params: PostRestorePreviousVersionParams): HttpResponse =
        restorePreviousVersion(params, RequestOptions.none())

    /** @see restorePreviousVersion */
    @MustBeClosed
    fun restorePreviousVersion(
        params: PostRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    @MustBeClosed
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: PostRestorePreviousVersionToDraftParams,
    ): HttpResponse = restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    @MustBeClosed
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: PostRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        restorePreviousVersionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restorePreviousVersionToDraft */
    @MustBeClosed
    fun restorePreviousVersionToDraft(
        params: PostRestorePreviousVersionToDraftParams
    ): HttpResponse = restorePreviousVersionToDraft(params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    @MustBeClosed
    fun restorePreviousVersionToDraft(
        params: PostRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    fun schedule(params: PostScheduleParams) = schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(params: PostScheduleParams, requestOptions: RequestOptions = RequestOptions.none())

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        schedule(
            PostScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(contentScheduleRequestVNext: ContentScheduleRequestVNext) =
        schedule(contentScheduleRequestVNext, RequestOptions.none())

    fun setLangPrimary(params: PostSetLangPrimaryParams) =
        setLangPrimary(params, RequestOptions.none())

    /** @see setLangPrimary */
    fun setLangPrimary(
        params: PostSetLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see setLangPrimary */
    fun setLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        setLangPrimary(
            PostSetLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setLangPrimary */
    fun setLangPrimary(setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext) =
        setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    @MustBeClosed
    fun updateDraft(objectId: String, params: PostUpdateDraftParams): HttpResponse =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    @MustBeClosed
    fun updateDraft(
        objectId: String,
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    @MustBeClosed
    fun updateDraft(params: PostUpdateDraftParams): HttpResponse =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    @MustBeClosed
    fun updateDraft(
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    @MustBeClosed
    fun updateLangs(params: PostUpdateLangsParams): HttpResponse =
        updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    @MustBeClosed
    fun updateLangs(
        params: PostUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see updateLangs */
    @MustBeClosed
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        updateLangs(
            PostUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    @MustBeClosed
    fun updateLangs(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext): HttpResponse =
        updateLangs(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [PostService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostService.WithRawResponse

        fun batch(): BatchService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts`, but is otherwise the
         * same as [PostService.create].
         */
        @MustBeClosed
        fun create(params: PostCreateParams): HttpResponse = create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see create */
        @MustBeClosed
        fun create(
            blogPost: BlogPost,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(blogPost: BlogPost): HttpResponse = create(blogPost, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: PostUpdateParams): HttpResponse =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PostUpdateParams): HttpResponse = update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts`, but is otherwise the same
         * as [PostService.list].
         */
        @MustBeClosed fun list(): HttpResponse = list(PostListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PostListParams = PostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see list */
        @MustBeClosed
        fun list(params: PostListParams = PostListParams.none()): HttpResponse =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponse =
            list(PostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostService.delete].
         */
        @MustBeClosed
        fun delete(objectId: String): HttpResponse = delete(objectId, PostDeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: PostDeleteParams = PostDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            objectId: String,
            params: PostDeleteParams = PostDeleteParams.none(),
        ): HttpResponse = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: PostDeleteParams): HttpResponse = delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(objectId: String, requestOptions: RequestOptions): HttpResponse =
            delete(objectId, PostDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/attach-to-lang-group`, but is otherwise the same
         * as [PostService.attachToLangGroup].
         */
        @MustBeClosed
        fun attachToLangGroup(params: PostAttachToLangGroupParams): HttpResponse =
            attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            params: PostAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            attachToLangGroup(
                PostAttachToLangGroupParams.builder()
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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/clone`, but is otherwise
         * the same as [PostService.clone].
         */
        @MustBeClosed
        fun clone(params: PostCloneParams): HttpResponse = clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: PostCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see clone */
        @MustBeClosed
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            clone(
                PostCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponse =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/create-language-variation`, but is otherwise the
         * same as [PostService.createLangVariation].
         */
        @MustBeClosed
        fun createLangVariation(params: PostCreateLangVariationParams): HttpResponse =
            createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            params: PostCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            createLangVariation(
                PostCreateLangVariationParams.builder()
                    .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
        ): HttpResponse =
            createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [PostService.detachFromLangGroup].
         */
        @MustBeClosed
        fun detachFromLangGroup(params: PostDetachFromLangGroupParams): HttpResponse =
            detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            params: PostDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            detachFromLangGroup(
                PostDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostService.get].
         */
        @MustBeClosed fun get(objectId: String): HttpResponse = get(objectId, PostGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            objectId: String,
            params: PostGetParams = PostGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, params: PostGetParams = PostGetParams.none()): HttpResponse =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: PostGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see get */
        @MustBeClosed
        fun get(params: PostGetParams): HttpResponse = get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(objectId: String, requestOptions: RequestOptions): HttpResponse =
            get(objectId, PostGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}/draft`, but is
         * otherwise the same as [PostService.getDraftById].
         */
        @MustBeClosed
        fun getDraftById(objectId: String): HttpResponse =
            getDraftById(objectId, PostGetDraftByIdParams.none())

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        ): HttpResponse = getDraftById(objectId, params, RequestOptions.none())

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            params: PostGetDraftByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(params: PostGetDraftByIdParams): HttpResponse =
            getDraftById(params, RequestOptions.none())

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(objectId: String, requestOptions: RequestOptions): HttpResponse =
            getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}`, but is otherwise the same as
         * [PostService.getPreviousVersion].
         */
        @MustBeClosed
        fun getPreviousVersion(
            revisionId: String,
            params: PostGetPreviousVersionParams,
        ): HttpResponse = getPreviousVersion(revisionId, params, RequestOptions.none())

        /** @see getPreviousVersion */
        @MustBeClosed
        fun getPreviousVersion(
            revisionId: String,
            params: PostGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getPreviousVersion */
        @MustBeClosed
        fun getPreviousVersion(params: PostGetPreviousVersionParams): HttpResponse =
            getPreviousVersion(params, RequestOptions.none())

        /** @see getPreviousVersion */
        @MustBeClosed
        fun getPreviousVersion(
            params: PostGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}/revisions`, but
         * is otherwise the same as [PostService.getPreviousVersions].
         */
        @MustBeClosed
        fun getPreviousVersions(objectId: String): HttpResponse =
            getPreviousVersions(objectId, PostGetPreviousVersionsParams.none())

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            objectId: String,
            params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            objectId: String,
            params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
        ): HttpResponse = getPreviousVersions(objectId, params, RequestOptions.none())

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            params: PostGetPreviousVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(params: PostGetPreviousVersionsParams): HttpResponse =
            getPreviousVersions(params, RequestOptions.none())

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(objectId: String, requestOptions: RequestOptions): HttpResponse =
            getPreviousVersions(objectId, PostGetPreviousVersionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/draft/push-live`, but is otherwise the same as
         * [PostService.pushLive].
         */
        @MustBeClosed
        fun pushLive(objectId: String): HttpResponse = pushLive(objectId, PostPushLiveParams.none())

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(
            objectId: String,
            params: PostPushLiveParams = PostPushLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(
            objectId: String,
            params: PostPushLiveParams = PostPushLiveParams.none(),
        ): HttpResponse = pushLive(objectId, params, RequestOptions.none())

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(
            params: PostPushLiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(params: PostPushLiveParams): HttpResponse =
            pushLive(params, RequestOptions.none())

        /** @see pushLive */
        @MustBeClosed
        fun pushLive(objectId: String, requestOptions: RequestOptions): HttpResponse =
            pushLive(objectId, PostPushLiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/{objectId}/draft/reset`,
         * but is otherwise the same as [PostService.resetDraft].
         */
        @MustBeClosed
        fun resetDraft(objectId: String): HttpResponse =
            resetDraft(objectId, PostResetDraftParams.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: PostResetDraftParams = PostResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            objectId: String,
            params: PostResetDraftParams = PostResetDraftParams.none(),
        ): HttpResponse = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(
            params: PostResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(params: PostResetDraftParams): HttpResponse =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        @MustBeClosed
        fun resetDraft(objectId: String, requestOptions: RequestOptions): HttpResponse =
            resetDraft(objectId, PostResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore`, but is otherwise the
         * same as [PostService.restorePreviousVersion].
         */
        @MustBeClosed
        fun restorePreviousVersion(
            revisionId: String,
            params: PostRestorePreviousVersionParams,
        ): HttpResponse = restorePreviousVersion(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersion */
        @MustBeClosed
        fun restorePreviousVersion(
            revisionId: String,
            params: PostRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            restorePreviousVersion(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersion */
        @MustBeClosed
        fun restorePreviousVersion(params: PostRestorePreviousVersionParams): HttpResponse =
            restorePreviousVersion(params, RequestOptions.none())

        /** @see restorePreviousVersion */
        @MustBeClosed
        fun restorePreviousVersion(
            params: PostRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [PostService.restorePreviousVersionToDraft].
         */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: PostRestorePreviousVersionToDraftParams,
        ): HttpResponse = restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: PostRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            restorePreviousVersionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersionToDraft */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            params: PostRestorePreviousVersionToDraftParams
        ): HttpResponse = restorePreviousVersionToDraft(params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            params: PostRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/schedule`, but is
         * otherwise the same as [PostService.schedule].
         */
        @MustBeClosed
        fun schedule(params: PostScheduleParams): HttpResponse =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            params: PostScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see schedule */
        @MustBeClosed
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            schedule(
                PostScheduleParams.builder()
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
         * /cms/blogs/2026-03/posts/multi-language/set-new-lang-primary`, but is otherwise the same
         * as [PostService.setLangPrimary].
         */
        @MustBeClosed
        fun setLangPrimary(params: PostSetLangPrimaryParams): HttpResponse =
            setLangPrimary(params, RequestOptions.none())

        /** @see setLangPrimary */
        @MustBeClosed
        fun setLangPrimary(
            params: PostSetLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see setLangPrimary */
        @MustBeClosed
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            setLangPrimary(
                PostSetLangPrimaryParams.builder()
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
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/posts/{objectId}/draft`, but is
         * otherwise the same as [PostService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(objectId: String, params: PostUpdateDraftParams): HttpResponse =
            updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: PostUpdateDraftParams): HttpResponse =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/update-languages`, but is otherwise the same as
         * [PostService.updateLangs].
         */
        @MustBeClosed
        fun updateLangs(params: PostUpdateLangsParams): HttpResponse =
            updateLangs(params, RequestOptions.none())

        /** @see updateLangs */
        @MustBeClosed
        fun updateLangs(
            params: PostUpdateLangsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateLangs */
        @MustBeClosed
        fun updateLangs(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLangs(
                PostUpdateLangsParams.builder()
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
