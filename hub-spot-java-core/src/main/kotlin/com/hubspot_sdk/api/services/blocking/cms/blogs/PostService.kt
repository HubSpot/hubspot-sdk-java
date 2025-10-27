// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionsPage
import com.hubspot_sdk.api.models.cms.blogs.posts.PostGetPreviousVersionsParams
import com.hubspot_sdk.api.models.cms.blogs.posts.PostListPage
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

    /** Create a new blog post, specifying its content in the request body. */
    fun create(params: PostCreateParams): BlogPost = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PostCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost

    /** @see create */
    fun create(
        blogPost: BlogPost,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost = create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

    /** @see create */
    fun create(blogPost: BlogPost): BlogPost = create(blogPost, RequestOptions.none())

    /**
     * Partially updates a single blog post by ID. You only need to specify the values that you want
     * to update.
     */
    fun update(objectId: String, params: PostUpdateParams): BlogPost =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost = update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: PostUpdateParams): BlogPost = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: PostUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost

    /**
     * Retrieve all blog posts, with paging and filtering options. This method would be useful for
     * an integration that ingests posts and suggests edits.
     */
    fun list(): PostListPage = list(PostListParams.none())

    /** @see list */
    fun list(
        params: PostListParams = PostListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostListPage

    /** @see list */
    fun list(params: PostListParams = PostListParams.none()): PostListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): PostListPage =
        list(PostListParams.none(), requestOptions)

    /** Delete a blog post by ID. */
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

    /**
     * Attach a blog post to a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    fun attachToLangGroup(params: PostAttachToLangGroupParams) =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: PostAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        attachToLangGroup(
            PostAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext) =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Clone a blog post, making a copy of it in a new blog post. */
    fun clone(params: PostCloneParams): BlogPost = clone(params, RequestOptions.none())

    /** @see clone */
    fun clone(
        params: PostCloneParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost

    /** @see clone */
    fun clone(
        contentCloneRequestVNext: ContentCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost =
        clone(
            PostCloneParams.builder().contentCloneRequestVNext(contentCloneRequestVNext).build(),
            requestOptions,
        )

    /** @see clone */
    fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): BlogPost =
        clone(contentCloneRequestVNext, RequestOptions.none())

    /** Create a new language variation from an existing blog post */
    fun createLangVariation(params: PostCreateLangVariationParams): BlogPost =
        createLangVariation(params, RequestOptions.none())

    /** @see createLangVariation */
    fun createLangVariation(
        params: PostCreateLangVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost

    /** @see createLangVariation */
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost =
        createLangVariation(
            PostCreateLangVariationParams.builder()
                .blogPostLanguageCloneRequestVNext(blogPostLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLangVariation */
    fun createLangVariation(
        blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext
    ): BlogPost = createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

    /**
     * Detach a blog post from a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    fun detachFromLangGroup(params: PostDetachFromLangGroupParams) =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: PostDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        detachFromLangGroup(
            PostDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext) =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the full draft version of a blog post. */
    fun getDraftById(objectId: String): BlogPost =
        getDraftById(objectId, PostGetDraftByIdParams.none())

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost = getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getDraftById */
    fun getDraftById(
        objectId: String,
        params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
    ): BlogPost = getDraftById(objectId, params, RequestOptions.none())

    /** @see getDraftById */
    fun getDraftById(
        params: PostGetDraftByIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost

    /** @see getDraftById */
    fun getDraftById(params: PostGetDraftByIdParams): BlogPost =
        getDraftById(params, RequestOptions.none())

    /** @see getDraftById */
    fun getDraftById(objectId: String, requestOptions: RequestOptions): BlogPost =
        getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

    /** Retrieve a previous version of a blog post. */
    fun getPreviousVersion(
        revisionId: String,
        params: PostGetPreviousVersionParams,
    ): VersionBlogPost = getPreviousVersion(revisionId, params, RequestOptions.none())

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        revisionId: String,
        params: PostGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionBlogPost =
        getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getPreviousVersion */
    fun getPreviousVersion(params: PostGetPreviousVersionParams): VersionBlogPost =
        getPreviousVersion(params, RequestOptions.none())

    /** @see getPreviousVersion */
    fun getPreviousVersion(
        params: PostGetPreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionBlogPost

    /** Retrieve all the previous versions of a blog post. */
    fun getPreviousVersions(objectId: String): PostGetPreviousVersionsPage =
        getPreviousVersions(objectId, PostGetPreviousVersionsParams.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostGetPreviousVersionsPage =
        getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
    ): PostGetPreviousVersionsPage = getPreviousVersions(objectId, params, RequestOptions.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        params: PostGetPreviousVersionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PostGetPreviousVersionsPage

    /** @see getPreviousVersions */
    fun getPreviousVersions(params: PostGetPreviousVersionsParams): PostGetPreviousVersionsPage =
        getPreviousVersions(params, RequestOptions.none())

    /** @see getPreviousVersions */
    fun getPreviousVersions(
        objectId: String,
        requestOptions: RequestOptions,
    ): PostGetPreviousVersionsPage =
        getPreviousVersions(objectId, PostGetPreviousVersionsParams.none(), requestOptions)

    /** Publish the draft version of the blog post, sending its content to the live page. */
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

    /** Retrieve a blog post by the post ID. */
    fun read(objectId: String): BlogPost = read(objectId, PostReadParams.none())

    /** @see read */
    fun read(
        objectId: String,
        params: PostReadParams = PostReadParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost = read(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see read */
    fun read(objectId: String, params: PostReadParams = PostReadParams.none()): BlogPost =
        read(objectId, params, RequestOptions.none())

    /** @see read */
    fun read(
        params: PostReadParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost

    /** @see read */
    fun read(params: PostReadParams): BlogPost = read(params, RequestOptions.none())

    /** @see read */
    fun read(objectId: String, requestOptions: RequestOptions): BlogPost =
        read(objectId, PostReadParams.none(), requestOptions)

    /**
     * Discard all drafted content, resetting the draft to contain the content in the currently
     * published version.
     */
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

    /** Restores a blog post to one of its previous versions. */
    fun restorePreviousVersion(
        revisionId: String,
        params: PostRestorePreviousVersionParams,
    ): BlogPost = restorePreviousVersion(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        revisionId: String,
        params: PostRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost =
        restorePreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(params: PostRestorePreviousVersionParams): BlogPost =
        restorePreviousVersion(params, RequestOptions.none())

    /** @see restorePreviousVersion */
    fun restorePreviousVersion(
        params: PostRestorePreviousVersionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost

    /**
     * Takes a specified version of a blog post, sets it as the new draft version of the blog post.
     */
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: PostRestorePreviousVersionToDraftParams,
    ): BlogPost = restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        revisionId: Long,
        params: PostRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost =
        restorePreviousVersionToDraft(
            params.toBuilder().revisionId(revisionId).build(),
            requestOptions,
        )

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(params: PostRestorePreviousVersionToDraftParams): BlogPost =
        restorePreviousVersionToDraft(params, RequestOptions.none())

    /** @see restorePreviousVersionToDraft */
    fun restorePreviousVersionToDraft(
        params: PostRestorePreviousVersionToDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost

    /** Schedule a blog post to be published at a specified time. */
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

    /**
     * Set the primary language of a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content)
     * to the language of the provided post (specified as an ID in the request body)
     */
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

    /**
     * Partially updates the draft version of a single blog post by ID. You only need to specify the
     * values that you want to update.
     */
    fun updateDraft(objectId: String, params: PostUpdateDraftParams): BlogPost =
        updateDraft(objectId, params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        objectId: String,
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost = updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see updateDraft */
    fun updateDraft(params: PostUpdateDraftParams): BlogPost =
        updateDraft(params, RequestOptions.none())

    /** @see updateDraft */
    fun updateDraft(
        params: PostUpdateDraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlogPost

    /**
     * Explicitly set new languages for each post in a
     * [multi-language group](https://developers.hubspot.com/docs/guides/cms/content/multi-language-content).
     */
    fun updateLangs(params: PostUpdateLangsParams) = updateLangs(params, RequestOptions.none())

    /** @see updateLangs */
    fun updateLangs(
        params: PostUpdateLangsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateLangs */
    fun updateLangs(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        updateLangs(
            PostUpdateLangsParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLangs */
    fun updateLangs(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext) =
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts`, but is otherwise the same as
         * [PostService.create].
         */
        @MustBeClosed
        fun create(params: PostCreateParams): HttpResponseFor<BlogPost> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: PostCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost>

        /** @see create */
        @MustBeClosed
        fun create(
            blogPost: BlogPost,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost> =
            create(PostCreateParams.builder().blogPost(blogPost).build(), requestOptions)

        /** @see create */
        @MustBeClosed
        fun create(blogPost: BlogPost): HttpResponseFor<BlogPost> =
            create(blogPost, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/blogs/posts/{objectId}`, but is otherwise
         * the same as [PostService.update].
         */
        @MustBeClosed
        fun update(objectId: String, params: PostUpdateParams): HttpResponseFor<BlogPost> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            objectId: String,
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: PostUpdateParams): HttpResponseFor<BlogPost> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: PostUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blogs/posts`, but is otherwise the same as
         * [PostService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PostListPage> = list(PostListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: PostListParams = PostListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: PostListParams = PostListParams.none()): HttpResponseFor<PostListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PostListPage> =
            list(PostListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/blogs/posts/{objectId}`, but is otherwise
         * the same as [PostService.delete].
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
         * /cms/v3/blogs/posts/multi-language/attach-to-lang-group`, but is otherwise the same as
         * [PostService.attachToLangGroup].
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/clone`, but is otherwise the
         * same as [PostService.clone].
         */
        @MustBeClosed
        fun clone(params: PostCloneParams): HttpResponseFor<BlogPost> =
            clone(params, RequestOptions.none())

        /** @see clone */
        @MustBeClosed
        fun clone(
            params: PostCloneParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost>

        /** @see clone */
        @MustBeClosed
        fun clone(
            contentCloneRequestVNext: ContentCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost> =
            clone(
                PostCloneParams.builder()
                    .contentCloneRequestVNext(contentCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see clone */
        @MustBeClosed
        fun clone(contentCloneRequestVNext: ContentCloneRequestVNext): HttpResponseFor<BlogPost> =
            clone(contentCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/posts/multi-language/create-language-variation`, but is otherwise the same
         * as [PostService.createLangVariation].
         */
        @MustBeClosed
        fun createLangVariation(params: PostCreateLangVariationParams): HttpResponseFor<BlogPost> =
            createLangVariation(params, RequestOptions.none())

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            params: PostCreateLangVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost>

        /** @see createLangVariation */
        @MustBeClosed
        fun createLangVariation(
            blogPostLanguageCloneRequestVNext: BlogPostLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost> =
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
        ): HttpResponseFor<BlogPost> =
            createLangVariation(blogPostLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/posts/multi-language/detach-from-lang-group`, but is otherwise the same as
         * [PostService.detachFromLangGroup].
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
         * Returns a raw HTTP response for `get /cms/v3/blogs/posts/{objectId}/draft`, but is
         * otherwise the same as [PostService.getDraftById].
         */
        @MustBeClosed
        fun getDraftById(objectId: String): HttpResponseFor<BlogPost> =
            getDraftById(objectId, PostGetDraftByIdParams.none())

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost> =
            getDraftById(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            objectId: String,
            params: PostGetDraftByIdParams = PostGetDraftByIdParams.none(),
        ): HttpResponseFor<BlogPost> = getDraftById(objectId, params, RequestOptions.none())

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            params: PostGetDraftByIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost>

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(params: PostGetDraftByIdParams): HttpResponseFor<BlogPost> =
            getDraftById(params, RequestOptions.none())

        /** @see getDraftById */
        @MustBeClosed
        fun getDraftById(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlogPost> =
            getDraftById(objectId, PostGetDraftByIdParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/blogs/posts/{objectId}/revisions/{revisionId}`, but is otherwise the same as
         * [PostService.getPreviousVersion].
         */
        @MustBeClosed
        fun getPreviousVersion(
            revisionId: String,
            params: PostGetPreviousVersionParams,
        ): HttpResponseFor<VersionBlogPost> =
            getPreviousVersion(revisionId, params, RequestOptions.none())

        /** @see getPreviousVersion */
        @MustBeClosed
        fun getPreviousVersion(
            revisionId: String,
            params: PostGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionBlogPost> =
            getPreviousVersion(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getPreviousVersion */
        @MustBeClosed
        fun getPreviousVersion(
            params: PostGetPreviousVersionParams
        ): HttpResponseFor<VersionBlogPost> = getPreviousVersion(params, RequestOptions.none())

        /** @see getPreviousVersion */
        @MustBeClosed
        fun getPreviousVersion(
            params: PostGetPreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionBlogPost>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blogs/posts/{objectId}/revisions`, but is
         * otherwise the same as [PostService.getPreviousVersions].
         */
        @MustBeClosed
        fun getPreviousVersions(objectId: String): HttpResponseFor<PostGetPreviousVersionsPage> =
            getPreviousVersions(objectId, PostGetPreviousVersionsParams.none())

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            objectId: String,
            params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostGetPreviousVersionsPage> =
            getPreviousVersions(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            objectId: String,
            params: PostGetPreviousVersionsParams = PostGetPreviousVersionsParams.none(),
        ): HttpResponseFor<PostGetPreviousVersionsPage> =
            getPreviousVersions(objectId, params, RequestOptions.none())

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            params: PostGetPreviousVersionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PostGetPreviousVersionsPage>

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            params: PostGetPreviousVersionsParams
        ): HttpResponseFor<PostGetPreviousVersionsPage> =
            getPreviousVersions(params, RequestOptions.none())

        /** @see getPreviousVersions */
        @MustBeClosed
        fun getPreviousVersions(
            objectId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PostGetPreviousVersionsPage> =
            getPreviousVersions(objectId, PostGetPreviousVersionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/{objectId}/draft/push-live`,
         * but is otherwise the same as [PostService.pushLive].
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
         * Returns a raw HTTP response for `get /cms/v3/blogs/posts/{objectId}`, but is otherwise
         * the same as [PostService.read].
         */
        @MustBeClosed
        fun read(objectId: String): HttpResponseFor<BlogPost> =
            read(objectId, PostReadParams.none())

        /** @see read */
        @MustBeClosed
        fun read(
            objectId: String,
            params: PostReadParams = PostReadParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost> =
            read(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see read */
        @MustBeClosed
        fun read(
            objectId: String,
            params: PostReadParams = PostReadParams.none(),
        ): HttpResponseFor<BlogPost> = read(objectId, params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(
            params: PostReadParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost>

        /** @see read */
        @MustBeClosed
        fun read(params: PostReadParams): HttpResponseFor<BlogPost> =
            read(params, RequestOptions.none())

        /** @see read */
        @MustBeClosed
        fun read(objectId: String, requestOptions: RequestOptions): HttpResponseFor<BlogPost> =
            read(objectId, PostReadParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/{objectId}/draft/reset`, but is
         * otherwise the same as [PostService.resetDraft].
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
         * /cms/v3/blogs/posts/{objectId}/revisions/{revisionId}/restore`, but is otherwise the same
         * as [PostService.restorePreviousVersion].
         */
        @MustBeClosed
        fun restorePreviousVersion(
            revisionId: String,
            params: PostRestorePreviousVersionParams,
        ): HttpResponseFor<BlogPost> =
            restorePreviousVersion(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersion */
        @MustBeClosed
        fun restorePreviousVersion(
            revisionId: String,
            params: PostRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost> =
            restorePreviousVersion(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersion */
        @MustBeClosed
        fun restorePreviousVersion(
            params: PostRestorePreviousVersionParams
        ): HttpResponseFor<BlogPost> = restorePreviousVersion(params, RequestOptions.none())

        /** @see restorePreviousVersion */
        @MustBeClosed
        fun restorePreviousVersion(
            params: PostRestorePreviousVersionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/posts/{objectId}/revisions/{revisionId}/restore-to-draft`, but is otherwise
         * the same as [PostService.restorePreviousVersionToDraft].
         */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: PostRestorePreviousVersionToDraftParams,
        ): HttpResponseFor<BlogPost> =
            restorePreviousVersionToDraft(revisionId, params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            revisionId: Long,
            params: PostRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost> =
            restorePreviousVersionToDraft(
                params.toBuilder().revisionId(revisionId).build(),
                requestOptions,
            )

        /** @see restorePreviousVersionToDraft */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            params: PostRestorePreviousVersionToDraftParams
        ): HttpResponseFor<BlogPost> = restorePreviousVersionToDraft(params, RequestOptions.none())

        /** @see restorePreviousVersionToDraft */
        @MustBeClosed
        fun restorePreviousVersionToDraft(
            params: PostRestorePreviousVersionToDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost>

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/posts/schedule`, but is otherwise the
         * same as [PostService.schedule].
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
         * /cms/v3/blogs/posts/multi-language/set-new-lang-primary`, but is otherwise the same as
         * [PostService.setLangPrimary].
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
         * Returns a raw HTTP response for `patch /cms/v3/blogs/posts/{objectId}/draft`, but is
         * otherwise the same as [PostService.updateDraft].
         */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
        ): HttpResponseFor<BlogPost> = updateDraft(objectId, params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            objectId: String,
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost> =
            updateDraft(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(params: PostUpdateDraftParams): HttpResponseFor<BlogPost> =
            updateDraft(params, RequestOptions.none())

        /** @see updateDraft */
        @MustBeClosed
        fun updateDraft(
            params: PostUpdateDraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlogPost>

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/posts/multi-language/update-languages`, but is otherwise the same as
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
