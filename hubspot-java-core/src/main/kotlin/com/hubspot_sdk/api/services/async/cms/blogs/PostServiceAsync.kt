// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

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
import com.hubspot_sdk.api.services.async.cms.blogs.posts.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PostServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostServiceAsync

    fun batch(): BatchServiceAsync

    fun create(params: PostCreateParams): CompletableFuture<HttpResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see create */
    fun create(
        blogPost: BlogPost,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

    /** @see create */
    fun create(blogPost: BlogPost): CompletableFuture<HttpResponse> =
        create(blogPost, RequestOptions.none())

    fun update(objectId: String, params: PostUpdateParams): CompletableFuture<HttpResponse> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: PostUpdateParams): CompletableFuture<HttpResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    fun list(): CompletableFuture<HttpResponse> = list(PostListParams.none())

    /** @see list */
    fun list(
        params: PostListParams = PostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see list */
    fun list(params: PostListParams = PostListParams.none()): CompletableFuture<HttpResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        list(PostListParams.none(), requestOptions)

    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, PostDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: PostDeleteParams = PostDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: PostDeleteParams = PostDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: PostDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: PostDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, PostDeleteParams.none(), requestOptions)

    fun attachToLangGroup(params: PostAttachToLangGroupParams): CompletableFuture<HttpResponse> =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: PostAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(
            PostAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    fun clone(params: PostCloneParams): CompletableFuture<HttpResponse> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: PostCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        clone(
            PostCloneParams.builder().contentCloneRequestVNext(contentCloneRequestVNext).build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CompletableFuture<HttpResponse> =
        clone(contentCloneRequestVNext, RequestOptions.none())

    fun createLangVariation(
        params: PostCreateLangVariationParams
    ): CompletableFuture<HttpResponse> = createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    fun createLangVariation(
        params: PostCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see createLangVariation */
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        createLangVariation(
            PostCreateLangVariationParams.builder()
                .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
    ): CompletableFuture<HttpResponse> =
        createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

    fun detachFromLangGroup(
        params: PostDetachFromLangGroupParams
    ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: PostDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(
            PostDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    fun get(objectId: String): CompletableFuture<HttpResponse> = get(objectId, PostGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: PostGetParams = PostGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: PostGetParams = PostGetParams.none(),
    ): CompletableFuture<HttpResponse> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: PostGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see get */
    fun get(params: PostGetParams): CompletableFuture<HttpResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        get(objectId, PostGetParams.none(), requestOptions)

    fun getDraftById(objectId: String): CompletableFuture<HttpResponse> =
        getDraftById(objectId, PostGetDraftByIdParams.none())

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
    ): CompletableFuture<HttpResponse> = getDraftById(objectId, params, RequestOptions.none())

    /** @see getDraftById */
    fun getDraftById(
        params: PostGetDraftByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getDraftById */
    fun getDraftById(params: PostGetDraftByIdParams): CompletableFuture<HttpResponse> =
        getDraftById(params, RequestOptions.none())

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

    fun getPreviousVersion(
        revisionId: String,
        params: PostGetPreviousVersionParams,
    ): CompletableFuture<HttpResponse> =
        getPreviousVersion(revisionId, params, RequestOptions.none())

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        revisionId: String,
        params: PostGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getPreviousVersion */
    fun getPreviousVersion(params: PostGetPreviousVersionParams): CompletableFuture<HttpResponse> =
        getPreviousVersion(params, RequestOptions.none())

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        params: PostGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    fun getPreviousVersions(objectId: String): CompletableFuture<HttpResponse> =
        getPreviousVersions(objectId, PostGetPreviousVersionsParams.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
    ): CompletableFuture<HttpResponse> =
        getPreviousVersions(objectId, params, RequestOptions.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        params: PostGetPreviousVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        params: PostGetPreviousVersionsParams
    ): CompletableFuture<HttpResponse> = getPreviousVersions(params, RequestOptions.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HttpResponse> =
        getPreviousVersions(objectId, PostGetPreviousVersionsParams.none(), requestOptions)

    fun pushLive(objectId: String): CompletableFuture<Void?> =
        pushLive(objectId, PostPushLiveParams.none())

    /** @see pushLive */
    fun pushLive(
        objectId: String,
        params: PostPushLiveParams = PostPushLiveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see pushLive */
    fun pushLive(
        objectId: String,
        params: PostPushLiveParams = PostPushLiveParams.none(),
    ): CompletableFuture<Void?> = pushLive(objectId, params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(
        params: PostPushLiveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see pushLive */
    fun pushLive(params: PostPushLiveParams): CompletableFuture<Void?> =
        pushLive(params, RequestOptions.none())

    /** @see pushLive */
    fun pushLive(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        pushLive(objectId, PostPushLiveParams.none(), requestOptions)

    fun resetDraft(objectId: String): CompletableFuture<Void?> =
        resetDraft(objectId, PostResetDraftParams.none())

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: PostResetDraftParams = PostResetDraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see resetDraft */
    fun resetDraft(
        objectId: String,
        params: PostResetDraftParams = PostResetDraftParams.none(),
    ): CompletableFuture<Void?> = resetDraft(objectId, params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(
        params: PostResetDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see resetDraft */
    fun resetDraft(params: PostResetDraftParams): CompletableFuture<Void?> =
        resetDraft(params, RequestOptions.none())

    /** @see resetDraft */
    fun resetDraft(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        resetDraft(objectId, PostResetDraftParams.none(), requestOptions)

    fun restorePreviousVersion(
        revisionId: String,
        params: PostRestorePreviousVersionParams,
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersion(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        revisionId: String,
        params: PostRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        params: PostRestorePreviousVersionParams
    ): CompletableFuture<HttpResponse> = restorePreviousVersion(params, RequestOptions.none())

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        params: PostRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: PostRestorePreviousVersionToDraftParams,
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: PostRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        params: PostRestorePreviousVersionToDraftParams
    ): CompletableFuture<HttpResponse> =
        restorePreviousVersionToDraft(params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        params: PostRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    fun schedule(params: PostScheduleParams): CompletableFuture<Void?> =
        schedule(params, RequestOptions.none())

    /** @see schedule */
    fun schedule(
        params: PostScheduleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        schedule(
            PostScheduleParams.builder()
                .contentScheduleRequestVNext(contentScheduleRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see schedule */
    fun schedule(
        contentScheduleRequestVNext: ContentScheduleRequestVNext
    ): CompletableFuture<Void?> = schedule(contentScheduleRequestVNext, RequestOptions.none())

    fun setLangPrimary(params: PostSetLangPrimaryParams): CompletableFuture<Void?> =
        setLangPrimary(params, RequestOptions.none())

    /** @see setLangPrimary */
    fun setLangPrimary(
        params: PostSetLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see setLangPrimary */
    fun setLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        setLangPrimary(
            PostSetLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setLangPrimary */
    fun setLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
    ): CompletableFuture<Void?> =
        setLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    fun updateDraft(
        objectId: String,
        params: PostUpdateDraftParams,
    ): CompletableFuture<HttpResponse> = updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: PostUpdateDraftParams): CompletableFuture<HttpResponse> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    fun updateLangs(params: PostUpdateLangsParams): CompletableFuture<HttpResponse> =
        updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    fun updateLangs(
        params: PostUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        updateLangs(
            PostUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
    ): CompletableFuture<HttpResponse> =
        updateLangs(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [PostServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PostServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts`, but is otherwise the
         * same as [PostServiceAsync.create].
         */
        fun create(params: PostCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            blogPost: BlogPost,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

        /** @see create */
        fun create(blogPost: BlogPost): CompletableFuture<HttpResponse> =
            create(blogPost, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostServiceAsync.update].
         */
        fun update(objectId: String, params: PostUpdateParams): CompletableFuture<HttpResponse> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: PostUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts`, but is otherwise the same
         * as [PostServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(PostListParams.none())

        /** @see list */
        fun list(
            params: PostListParams = PostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(params: PostListParams = PostListParams.none()): CompletableFuture<HttpResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(PostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, PostDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: PostDeleteParams = PostDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: PostDeleteParams = PostDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: PostDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: PostDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, PostDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/attach-to-lang-group`, but is otherwise the same
         * as [PostServiceAsync.attachToLangGroup].
         */
        fun attachToLangGroup(
            params: PostAttachToLangGroupParams
        ): CompletableFuture<HttpResponse> = attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            params: PostAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(
                PostAttachToLangGroupParams.builder()
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
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/clone`, but is otherwise
         * the same as [PostServiceAsync.clone].
         */
        fun clone(params: PostCloneParams): CompletableFuture<HttpResponse> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: PostCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            clone(
                PostCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext
        ): CompletableFuture<HttpResponse> = clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/create-language-variation`, but is otherwise the
         * same as [PostServiceAsync.createLangVariation].
         */
        fun createLangVariation(
            params: PostCreateLangVariationParams
        ): CompletableFuture<HttpResponse> = createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        fun createLangVariation(
            params: PostCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createLangVariation */
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createLangVariation(
                PostCreateLangVariationParams.builder()
                    .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLangVariation */
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
        ): CompletableFuture<HttpResponse> =
            createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [PostServiceAsync.detachFromLangGroup].
         */
        fun detachFromLangGroup(
            params: PostDetachFromLangGroupParams
        ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            params: PostDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(
                PostDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}`, but is
         * otherwise the same as [PostServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponse> =
            get(objectId, PostGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: PostGetParams = PostGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: PostGetParams = PostGetParams.none(),
        ): CompletableFuture<HttpResponse> = get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: PostGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see get */
        fun get(params: PostGetParams): CompletableFuture<HttpResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            get(objectId, PostGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}/draft`, but is
         * otherwise the same as [PostServiceAsync.getDraftById].
         */
        fun getDraftById(objectId: String): CompletableFuture<HttpResponse> =
            getDraftById(objectId, PostGetDraftByIdParams.none())

        /** @see getDraftById */
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraftById */
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        ): CompletableFuture<HttpResponse> = getDraftById(objectId, params, RequestOptions.none())

        /** @see getDraftById */
        fun getDraftById(
            params: PostGetDraftByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getDraftById */
        fun getDraftById(params: PostGetDraftByIdParams): CompletableFuture<HttpResponse> =
            getDraftById(params, RequestOptions.none())

        /** @see getDraftById */
        fun getDraftById(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}`, but is otherwise the same as
         * [PostServiceAsync.getPreviousVersion].
         */
        fun getPreviousVersion(
            revisionId: String,
            params: PostGetPreviousVersionParams,
        ): CompletableFuture<HttpResponse> =
            getPreviousVersion(revisionId, params, RequestOptions.none())

        /** @see getPreviousVersion */
        fun getPreviousVersion(
            revisionId: String,
            params: PostGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getPreviousVersion */
        fun getPreviousVersion(
            params: PostGetPreviousVersionParams
        ): CompletableFuture<HttpResponse> = getPreviousVersion(params, RequestOptions.none())

        /** @see getPreviousVersion */
        fun getPreviousVersion(
            params: PostGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/{objectId}/revisions`, but
         * is otherwise the same as [PostServiceAsync.getPreviousVersions].
         */
        fun getPreviousVersions(objectId: String): CompletableFuture<HttpResponse> =
            getPreviousVersions(objectId, PostGetPreviousVersionsParams.none())

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            objectId: String,
            params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            objectId: String,
            params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
        ): CompletableFuture<HttpResponse> =
            getPreviousVersions(objectId, params, RequestOptions.none())

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            params: PostGetPreviousVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            params: PostGetPreviousVersionsParams
        ): CompletableFuture<HttpResponse> = getPreviousVersions(params, RequestOptions.none())

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            getPreviousVersions(objectId, PostGetPreviousVersionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/draft/push-live`, but is otherwise the same as
         * [PostServiceAsync.pushLive].
         */
        fun pushLive(objectId: String): CompletableFuture<HttpResponse> =
            pushLive(objectId, PostPushLiveParams.none())

        /** @see pushLive */
        fun pushLive(
            objectId: String,
            params: PostPushLiveParams = PostPushLiveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            pushLive(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see pushLive */
        fun pushLive(
            objectId: String,
            params: PostPushLiveParams = PostPushLiveParams.none(),
        ): CompletableFuture<HttpResponse> = pushLive(objectId, params, RequestOptions.none())

        /** @see pushLive */
        fun pushLive(
            params: PostPushLiveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see pushLive */
        fun pushLive(params: PostPushLiveParams): CompletableFuture<HttpResponse> =
            pushLive(params, RequestOptions.none())

        /** @see pushLive */
        fun pushLive(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            pushLive(objectId, PostPushLiveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/{objectId}/draft/reset`,
         * but is otherwise the same as [PostServiceAsync.resetDraft].
         */
        fun resetDraft(objectId: String): CompletableFuture<HttpResponse> =
            resetDraft(objectId, PostResetDraftParams.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: PostResetDraftParams = PostResetDraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            resetDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            params: PostResetDraftParams = PostResetDraftParams.none(),
        ): CompletableFuture<HttpResponse> = resetDraft(objectId, params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            params: PostResetDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see resetDraft */
        fun resetDraft(params: PostResetDraftParams): CompletableFuture<HttpResponse> =
            resetDraft(params, RequestOptions.none())

        /** @see resetDraft */
        fun resetDraft(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            resetDraft(objectId, PostResetDraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore`, but is otherwise the
         * same as [PostServiceAsync.restorePreviousVersion].
         */
        fun restorePreviousVersion(
            revisionId: String,
            params: PostRestorePreviousVersionParams,
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersion(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersion */
        fun restorePreviousVersion(
            revisionId: String,
            params: PostRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersion(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersion */
        fun restorePreviousVersion(
            params: PostRestorePreviousVersionParams
        ): CompletableFuture<HttpResponse> = restorePreviousVersion(params, RequestOptions.none())

        /** @see restorePreviousVersion */
        fun restorePreviousVersion(
            params: PostRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/{objectId}/revisions/{revisionId}/restore-to-draft`, but is
         * otherwise the same as [PostServiceAsync.restorePreviousVersionToDraft].
         */
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: PostRestorePreviousVersionToDraftParams,
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: PostRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersionToDraft */
        fun restorePreviousVersionToDraft(
            params: PostRestorePreviousVersionToDraftParams
        ): CompletableFuture<HttpResponse> =
            restorePreviousVersionToDraft(params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        fun restorePreviousVersionToDraft(
            params: PostRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/posts/schedule`, but is
         * otherwise the same as [PostServiceAsync.schedule].
         */
        fun schedule(params: PostScheduleParams): CompletableFuture<HttpResponse> =
            schedule(params, RequestOptions.none())

        /** @see schedule */
        fun schedule(
            params: PostScheduleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see schedule */
        fun schedule(
            contentScheduleRequestVNext: ContentScheduleRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            schedule(
                PostScheduleParams.builder()
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
         * /cms/blogs/2026-03/posts/multi-language/set-new-lang-primary`, but is otherwise the same
         * as [PostServiceAsync.setLangPrimary].
         */
        fun setLangPrimary(params: PostSetLangPrimaryParams): CompletableFuture<HttpResponse> =
            setLangPrimary(params, RequestOptions.none())

        /** @see setLangPrimary */
        fun setLangPrimary(
            params: PostSetLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see setLangPrimary */
        fun setLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            setLangPrimary(
                PostSetLangPrimaryParams.builder()
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
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/posts/{objectId}/draft`, but is
         * otherwise the same as [PostServiceAsync.updateDraft].
         */
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
        ): CompletableFuture<HttpResponse> = updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(params: PostUpdateDraftParams): CompletableFuture<HttpResponse> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/posts/multi-language/update-languages`, but is otherwise the same as
         * [PostServiceAsync.updateLangs].
         */
        fun updateLangs(params: PostUpdateLangsParams): CompletableFuture<HttpResponse> =
            updateLangs(params, RequestOptions.none())

        /** @see updateLangs */
        fun updateLangs(
            params: PostUpdateLangsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateLangs */
        fun updateLangs(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLangs(
                PostUpdateLangsParams.builder()
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
