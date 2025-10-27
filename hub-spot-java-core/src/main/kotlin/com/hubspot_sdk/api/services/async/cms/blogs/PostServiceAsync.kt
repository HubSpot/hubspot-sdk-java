// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.ContentCloneRequestVNext
import com.hubspot_sdk.api.models.cms.ContentScheduleRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.posts.BlogPost
import com.hubspot_sdk.api.models.cms.blogs.posts.BlogPostLanguageCloneRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.posts.PostAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCloneParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCreateLangVariationParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostCreateParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetDraftByIdParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionsPageAsync
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostListPageAsync
import com.hubspot_sdk.api.models.cms.blogs.posts.PostListParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostPushLiveParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostReadParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostResetDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostRestorePreviousVersionParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostRestorePreviousVersionToDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostScheduleParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostSetLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateDraftParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateLangsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostUpdateParams
import com.hubspot_sdk.api.models.cms.blogs.posts.VersionBlogPost
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

    /** Create a new blog post, specifying its content in the request body. */
    fun create(params: PostCreateParams): CompletableFuture<BlogPost> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost>

    /** @see create */
    fun create(
        blogPost: BlogPost,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost> =
        create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

    /** @see create */
    fun create(blogPost: BlogPost): CompletableFuture<BlogPost> =
        create(blogPost, RequestOptions.none())

    /**
     * Partially updates a single blog post by ID. You only need to specify the values that you want
     * to update.
     */
    fun update(objectId: String, params: PostUpdateParams): CompletableFuture<BlogPost> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: PostUpdateParams): CompletableFuture<BlogPost> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost>

    /**
     * Retrieve all blog posts, with paging and filtering options. This method would be useful for
     * an integration that ingests posts and suggests edits.
     */
    fun list(): CompletableFuture<PostListPageAsync> = list(PostListParams.none())

    /** @see list */
    fun list(
        params: PostListParams = PostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostListPageAsync>

    /** @see list */
    fun list(params: PostListParams = PostListParams.none()): CompletableFuture<PostListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PostListPageAsync> =
        list(PostListParams.none(), requestOptions)

    /** Delete a blog post by ID. */
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

    /**
     * Attach a blog post to a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    fun attachToLangGroup(params: PostAttachToLangGroupParams): CompletableFuture<Void?> =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: PostAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        attachToLangGroup(
            PostAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<Void?> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Clone a blog post, making a copy of it in a new blog post. */
    fun clone(params: PostCloneParams): CompletableFuture<BlogPost> =
        clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: PostCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost>

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost> =
        clone(
            PostCloneParams.builder().contentCloneRequestVNext(contentCloneRequestVNext).build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): CompletableFuture<BlogPost> =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Create a new language variation from an existing blog post */
    fun createLangVariation(params: PostCreateLangVariationParams): CompletableFuture<BlogPost> =
        createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    fun createLangVariation(
        params: PostCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost>

    /** @see createLangVariation */
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost> =
        createLangVariation(
            PostCreateLangVariationParams.builder()
                .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
    ): CompletableFuture<BlogPost> =
        createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

    /**
     * Detach a blog post from a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    fun detachFromLangGroup(params: PostDetachFromLangGroupParams): CompletableFuture<Void?> =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: PostDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        detachFromLangGroup(
            PostDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<Void?> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the full draft version of a blog post. */
    fun getDraftById(objectId: String): CompletableFuture<BlogPost> =
        getDraftById(objectId, PostGetDraftByIdParams.none())

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost> =
        getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
    ): CompletableFuture<BlogPost> = getDraftById(objectId, params, RequestOptions.none())

    /** @see getDraftById */
    fun getDraftById(
        params: PostGetDraftByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost>

    /** @see getDraftById */
    fun getDraftById(params: PostGetDraftByIdParams): CompletableFuture<BlogPost> =
        getDraftById(params, RequestOptions.none())

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BlogPost> =
        getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

    /** Retrieve a previous version of a blog post. */
    fun getPreviousVersion(
        revisionId: String,
        params: PostGetPreviousVersionParams,
    ): CompletableFuture<VersionBlogPost> =
        getPreviousVersion(revisionId, params, RequestOptions.none())

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        revisionId: String,
        params: PostGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionBlogPost> =
        getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        params: PostGetPreviousVersionParams
    ): CompletableFuture<VersionBlogPost> = getPreviousVersion(params, RequestOptions.none())

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        params: PostGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionBlogPost>

    /** Retrieve all the previous versions of a blog post. */
    fun getPreviousVersions(objectId: String): CompletableFuture<PostGetPreviousVersionsPageAsync> =
        getPreviousVersions(objectId, PostGetPreviousVersionsParams.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostGetPreviousVersionsPageAsync> =
        getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
    ): CompletableFuture<PostGetPreviousVersionsPageAsync> =
        getPreviousVersions(objectId, params, RequestOptions.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        params: PostGetPreviousVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PostGetPreviousVersionsPageAsync>

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        params: PostGetPreviousVersionsParams
    ): CompletableFuture<PostGetPreviousVersionsPageAsync> =
        getPreviousVersions(params, RequestOptions.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PostGetPreviousVersionsPageAsync> =
        getPreviousVersions(objectId, PostGetPreviousVersionsParams.none(), requestOptions)

    /** Publish the draft version of the blog post, sending its content to the live page. */
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

    /** Retrieve a blog post by the post ID. */
    fun read(objectId: String): CompletableFuture<BlogPost> = read(objectId, PostReadParams.none())

    /** @see read */
    fun read(
        objectId: String,
        params: PostReadParams = PostReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost> =
        read(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see read */
    fun read(
        objectId: String,
        params: PostReadParams = PostReadParams.none(),
    ): CompletableFuture<BlogPost> = read(objectId, params, RequestOptions.none())

    /** @see read */
    fun read(
        params: PostReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost>

    /** @see read */
    fun read(params: PostReadParams): CompletableFuture<BlogPost> =
        read(params, RequestOptions.none())

    /** @see read */
    fun read(objectId: String, requestOptions: RequestOptions): CompletableFuture<BlogPost> =
        read(objectId, PostReadParams.none(), requestOptions)

    /**
     * Discard all drafted content, resetting the draft to contain the content in the currently
     * published version.
     */
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

    /** Restores a blog post to one of its previous versions. */
    fun restorePreviousVersion(
        revisionId: String,
        params: PostRestorePreviousVersionParams,
    ): CompletableFuture<BlogPost> =
        restorePreviousVersion(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        revisionId: String,
        params: PostRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost> =
        restorePreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        params: PostRestorePreviousVersionParams
    ): CompletableFuture<BlogPost> = restorePreviousVersion(params, RequestOptions.none())

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        params: PostRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost>

    /**
     * Takes a specified version of a blog post, sets it as the new draft version of the blog post.
     */
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: PostRestorePreviousVersionToDraftParams,
    ): CompletableFuture<BlogPost> =
        restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: PostRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost> =
        restorePreviousVersionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        params: PostRestorePreviousVersionToDraftParams
    ): CompletableFuture<BlogPost> = restorePreviousVersionToDraft(params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        params: PostRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost>

    /** Schedule a blog post to be published at a specified time. */
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

    /**
     * Set the primary language of a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content)
     * to the language of the provided post (specified as an ID in the request body)
     */
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

    /**
     * Partially updates the draft version of a single blog post by ID. You only need to specify the
     * values that you want to update.
     */
    fun updateDraft(objectId: String, params: PostUpdateDraftParams): CompletableFuture<BlogPost> =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost> =
        updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: PostUpdateDraftParams): CompletableFuture<BlogPost> =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogPost>

    /**
     * Explicitly set new languages for each post in a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    fun updateLangs(params: PostUpdateLangsParams): CompletableFuture<Void?> =
        updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    fun updateLangs(
        params: PostUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateLangs(
            PostUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
    ): CompletableFuture<Void?> = updateLangs(updateLanguagesRequestVNext, RequestOptions.none())

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
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts`, but is otherwise the same as
         * [PostServiceAsync.create].
         */
        fun create(params: PostCreateParams): CompletableFuture<HttpResponseFor<BlogPost>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>>

        /** @see create */
        fun create(
            blogPost: BlogPost,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

        /** @see create */
        fun create(blogPost: BlogPost): CompletableFuture<HttpResponseFor<BlogPost>> =
            create(blogPost, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/blogs/posts/{objectId}`, but is otherwise
         * the same as [PostServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: PostUpdateParams,
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: PostUpdateParams): CompletableFuture<HttpResponseFor<BlogPost>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blogs/posts`, but is otherwise the same as
         * [PostServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PostListPageAsync>> =
            list(PostListParams.none())

        /** @see list */
        fun list(
            params: PostListParams = PostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostListPageAsync>>

        /** @see list */
        fun list(
            params: PostListParams = PostListParams.none()
        ): CompletableFuture<HttpResponseFor<PostListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PostListPageAsync>> =
            list(PostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/blogs/posts/{objectId}`, but is otherwise
         * the same as [PostServiceAsync.delete].
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
         * /cms/v3/blogs/posts/multi-language/attach-to-lang-group`, but is otherwise the same as
         * [PostServiceAsync.attachToLangGroup].
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/clone`, but is otherwise the
         * same as [PostServiceAsync.clone].
         */
        fun clone(params: PostCloneParams): CompletableFuture<HttpResponseFor<BlogPost>> =
            clone(params, RequestOptions.none())

        /** @see clone */
        fun clone(
            params: PostCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>>

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            clone(
                PostCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/posts/multi-language/create-language-variation`, but is otherwise the same
         * as [PostServiceAsync.createLangVariation].
         */
        fun createLangVariation(
            params: PostCreateLangVariationParams
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        fun createLangVariation(
            params: PostCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>>

        /** @see createLangVariation */
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            createLangVariation(
                PostCreateLangVariationParams.builder()
                    .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLangVariation */
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/posts/multi-language/detach-from-lang-group`, but is otherwise the same as
         * [PostServiceAsync.detachFromLangGroup].
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
         * Returns a raw HTTP response for `get /cms/v3/blogs/posts/{objectId}/draft`, but is
         * otherwise the same as [PostServiceAsync.getDraftById].
         */
        fun getDraftById(objectId: String): CompletableFuture<HttpResponseFor<BlogPost>> =
            getDraftById(objectId, PostGetDraftByIdParams.none())

        /** @see getDraftById */
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraftById */
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            getDraftById(objectId, params, RequestOptions.none())

        /** @see getDraftById */
        fun getDraftById(
            params: PostGetDraftByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>>

        /** @see getDraftById */
        fun getDraftById(
            params: PostGetDraftByIdParams
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            getDraftById(params, RequestOptions.none())

        /** @see getDraftById */
        fun getDraftById(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/blogs/posts/{objectId}/revisions/{revisionId}`, but is otherwise the same as
         * [PostServiceAsync.getPreviousVersion].
         */
        fun getPreviousVersion(
            revisionId: String,
            params: PostGetPreviousVersionParams,
        ): CompletableFuture<HttpResponseFor<VersionBlogPost>> =
            getPreviousVersion(revisionId, params, RequestOptions.none())

        /** @see getPreviousVersion */
        fun getPreviousVersion(
            revisionId: String,
            params: PostGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionBlogPost>> =
            getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getPreviousVersion */
        fun getPreviousVersion(
            params: PostGetPreviousVersionParams
        ): CompletableFuture<HttpResponseFor<VersionBlogPost>> =
            getPreviousVersion(params, RequestOptions.none())

        /** @see getPreviousVersion */
        fun getPreviousVersion(
            params: PostGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionBlogPost>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blogs/posts/{objectId}/revisions`, but is
         * otherwise the same as [PostServiceAsync.getPreviousVersions].
         */
        fun getPreviousVersions(
            objectId: String
        ): CompletableFuture<HttpResponseFor<PostGetPreviousVersionsPageAsync>> =
            getPreviousVersions(objectId, PostGetPreviousVersionsParams.none())

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            objectId: String,
            params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostGetPreviousVersionsPageAsync>> =
            getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            objectId: String,
            params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
        ): CompletableFuture<HttpResponseFor<PostGetPreviousVersionsPageAsync>> =
            getPreviousVersions(objectId, params, RequestOptions.none())

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            params: PostGetPreviousVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PostGetPreviousVersionsPageAsync>>

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            params: PostGetPreviousVersionsParams
        ): CompletableFuture<HttpResponseFor<PostGetPreviousVersionsPageAsync>> =
            getPreviousVersions(params, RequestOptions.none())

        /** @see getPreviousVersions */
        fun getPreviousVersions(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PostGetPreviousVersionsPageAsync>> =
            getPreviousVersions(objectId, PostGetPreviousVersionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/{objectId}/draft/push-live`,
         * but is otherwise the same as [PostServiceAsync.pushLive].
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
         * Returns a raw HTTP response for `get /cms/v3/blogs/posts/{objectId}`, but is otherwise
         * the same as [PostServiceAsync.read].
         */
        fun read(objectId: String): CompletableFuture<HttpResponseFor<BlogPost>> =
            read(objectId, PostReadParams.none())

        /** @see read */
        fun read(
            objectId: String,
            params: PostReadParams = PostReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            read(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see read */
        fun read(
            objectId: String,
            params: PostReadParams = PostReadParams.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            read(objectId, params, RequestOptions.none())

        /** @see read */
        fun read(
            params: PostReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>>

        /** @see read */
        fun read(params: PostReadParams): CompletableFuture<HttpResponseFor<BlogPost>> =
            read(params, RequestOptions.none())

        /** @see read */
        fun read(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            read(objectId, PostReadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/{objectId}/draft/reset`, but is
         * otherwise the same as [PostServiceAsync.resetDraft].
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
         * /cms/v3/blogs/posts/{objectId}/revisions/{revisionId}/restore`, but is otherwise the same
         * as [PostServiceAsync.restorePreviousVersion].
         */
        fun restorePreviousVersion(
            revisionId: String,
            params: PostRestorePreviousVersionParams,
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            restorePreviousVersion(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersion */
        fun restorePreviousVersion(
            revisionId: String,
            params: PostRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            restorePreviousVersion(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersion */
        fun restorePreviousVersion(
            params: PostRestorePreviousVersionParams
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            restorePreviousVersion(params, RequestOptions.none())

        /** @see restorePreviousVersion */
        fun restorePreviousVersion(
            params: PostRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/posts/{objectId}/revisions/{revisionId}/restore-to-draft`, but is otherwise
         * the same as [PostServiceAsync.restorePreviousVersionToDraft].
         */
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: PostRestorePreviousVersionToDraftParams,
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: PostRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            restorePreviousVersionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersionToDraft */
        fun restorePreviousVersionToDraft(
            params: PostRestorePreviousVersionToDraftParams
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            restorePreviousVersionToDraft(params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        fun restorePreviousVersionToDraft(
            params: PostRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>>

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/schedule`, but is otherwise the
         * same as [PostServiceAsync.schedule].
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
         * /cms/v3/blogs/posts/multi-language/set-new-lang-primary`, but is otherwise the same as
         * [PostServiceAsync.setLangPrimary].
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
         * Returns a raw HTTP response for `patch /cms/v3/blogs/posts/{objectId}/draft`, but is
         * otherwise the same as [PostServiceAsync.updateDraft].
         */
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        fun updateDraft(
            params: PostUpdateDraftParams
        ): CompletableFuture<HttpResponseFor<BlogPost>> = updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        fun updateDraft(
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogPost>>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/posts/multi-language/update-languages`, but is otherwise the same as
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
