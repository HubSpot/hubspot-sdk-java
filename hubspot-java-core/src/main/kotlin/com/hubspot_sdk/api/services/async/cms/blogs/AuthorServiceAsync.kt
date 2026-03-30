// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListByQueryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListPostsByQueryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListPostsParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListTagsByQueryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListTagsParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthorCloneRequestVNext
import com.hubspot_sdk.api.services.async.cms.blogs.authors.BatchServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AuthorServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthorServiceAsync

    fun batch(): BatchServiceAsync

    /** Create a new Blog Author. */
    fun create(params: AuthorCreateParams): CompletableFuture<HttpResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see create */
    fun create(
        blogAuthor: BlogAuthor,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        create(AuthorCreateParams.builder().blogAuthor(blogAuthor).build(), requestOptions)

    /** @see create */
    fun create(blogAuthor: BlogAuthor): CompletableFuture<HttpResponse> =
        create(blogAuthor, RequestOptions.none())

    /**
     * Sparse updates a single Blog Author object identified by the id in the path. All the column
     * values need not be specified. Only the that need to be modified can be specified.
     */
    fun update(objectId: String, params: AuthorUpdateParams): CompletableFuture<HttpResponse> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: AuthorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: AuthorUpdateParams): CompletableFuture<HttpResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AuthorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    fun list(): CompletableFuture<HttpResponse> = list(AuthorListParams.none())

    /** @see list */
    fun list(
        params: AuthorListParams = AuthorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see list */
    fun list(params: AuthorListParams = AuthorListParams.none()): CompletableFuture<HttpResponse> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        list(AuthorListParams.none(), requestOptions)

    /** Delete the Blog Author object identified by the id in the path. */
    fun delete(objectId: String): CompletableFuture<Void?> =
        delete(objectId, AuthorDeleteParams.none())

    /** @see delete */
    fun delete(
        objectId: String,
        params: AuthorDeleteParams = AuthorDeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see delete */
    fun delete(
        objectId: String,
        params: AuthorDeleteParams = AuthorDeleteParams.none(),
    ): CompletableFuture<Void?> = delete(objectId, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AuthorDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AuthorDeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(objectId: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(objectId, AuthorDeleteParams.none(), requestOptions)

    /** Attach a Blog Author to a multi-language group. */
    fun attachToLangGroup(params: AuthorAttachToLangGroupParams): CompletableFuture<HttpResponse> =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: AuthorAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(
            AuthorAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create a new language variation from an existing Blog Author. */
    fun createLanguageVariation(
        params: AuthorCreateLanguageVariationParams
    ): CompletableFuture<HttpResponse> = createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: AuthorCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        createLanguageVariation(
            AuthorCreateLanguageVariationParams.builder()
                .blogAuthorCloneRequestVNext(blogAuthorCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext
    ): CompletableFuture<HttpResponse> =
        createLanguageVariation(blogAuthorCloneRequestVNext, RequestOptions.none())

    /** Detach a Blog Author from a multi-language group. */
    fun detachFromLangGroup(
        params: AuthorDetachFromLangGroupParams
    ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: AuthorDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(
            AuthorDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the Blog Author object identified by the id in the path. */
    fun get(objectId: String): CompletableFuture<HttpResponse> =
        get(objectId, AuthorGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: AuthorGetParams = AuthorGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: AuthorGetParams = AuthorGetParams.none(),
    ): CompletableFuture<HttpResponse> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AuthorGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see get */
    fun get(params: AuthorGetParams): CompletableFuture<HttpResponse> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        get(objectId, AuthorGetParams.none(), requestOptions)

    fun listByQuery(): CompletableFuture<HttpResponse> = listByQuery(AuthorListByQueryParams.none())

    /** @see listByQuery */
    fun listByQuery(
        params: AuthorListByQueryParams = AuthorListByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listByQuery */
    fun listByQuery(
        params: AuthorListByQueryParams = AuthorListByQueryParams.none()
    ): CompletableFuture<HttpResponse> = listByQuery(params, RequestOptions.none())

    /** @see listByQuery */
    fun listByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listByQuery(AuthorListByQueryParams.none(), requestOptions)

    fun listPosts(): CompletableFuture<HttpResponse> = listPosts(AuthorListPostsParams.none())

    /** @see listPosts */
    fun listPosts(
        params: AuthorListPostsParams = AuthorListPostsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listPosts */
    fun listPosts(
        params: AuthorListPostsParams = AuthorListPostsParams.none()
    ): CompletableFuture<HttpResponse> = listPosts(params, RequestOptions.none())

    /** @see listPosts */
    fun listPosts(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listPosts(AuthorListPostsParams.none(), requestOptions)

    fun listPostsByQuery(): CompletableFuture<HttpResponse> =
        listPostsByQuery(AuthorListPostsByQueryParams.none())

    /** @see listPostsByQuery */
    fun listPostsByQuery(
        params: AuthorListPostsByQueryParams = AuthorListPostsByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listPostsByQuery */
    fun listPostsByQuery(
        params: AuthorListPostsByQueryParams = AuthorListPostsByQueryParams.none()
    ): CompletableFuture<HttpResponse> = listPostsByQuery(params, RequestOptions.none())

    /** @see listPostsByQuery */
    fun listPostsByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listPostsByQuery(AuthorListPostsByQueryParams.none(), requestOptions)

    fun listTags(): CompletableFuture<HttpResponse> = listTags(AuthorListTagsParams.none())

    /** @see listTags */
    fun listTags(
        params: AuthorListTagsParams = AuthorListTagsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listTags */
    fun listTags(
        params: AuthorListTagsParams = AuthorListTagsParams.none()
    ): CompletableFuture<HttpResponse> = listTags(params, RequestOptions.none())

    /** @see listTags */
    fun listTags(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listTags(AuthorListTagsParams.none(), requestOptions)

    fun listTagsByQuery(): CompletableFuture<HttpResponse> =
        listTagsByQuery(AuthorListTagsByQueryParams.none())

    /** @see listTagsByQuery */
    fun listTagsByQuery(
        params: AuthorListTagsByQueryParams = AuthorListTagsByQueryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see listTagsByQuery */
    fun listTagsByQuery(
        params: AuthorListTagsByQueryParams = AuthorListTagsByQueryParams.none()
    ): CompletableFuture<HttpResponse> = listTagsByQuery(params, RequestOptions.none())

    /** @see listTagsByQuery */
    fun listTagsByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
        listTagsByQuery(AuthorListTagsByQueryParams.none(), requestOptions)

    /** Set a Blog Author as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: AuthorSetNewLangPrimaryParams): CompletableFuture<Void?> =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: AuthorSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        setNewLangPrimary(
            AuthorSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
    ): CompletableFuture<Void?> =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Explicitly set new languages for each Blog Author in a multi-language group. */
    fun updateLanguages(params: AuthorUpdateLanguagesParams): CompletableFuture<HttpResponse> =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: AuthorUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        updateLanguages(
            AuthorUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
    ): CompletableFuture<HttpResponse> =
        updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())

    /**
     * A view of [AuthorServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthorServiceAsync.WithRawResponse

        fun batch(): BatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cms/blogs/2026-03/authors`, but is otherwise the
         * same as [AuthorServiceAsync.create].
         */
        fun create(params: AuthorCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AuthorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see create */
        fun create(
            blogAuthor: BlogAuthor,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(AuthorCreateParams.builder().blogAuthor(blogAuthor).build(), requestOptions)

        /** @see create */
        fun create(blogAuthor: BlogAuthor): CompletableFuture<HttpResponse> =
            create(blogAuthor, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/blogs/2026-03/authors/{objectId}`, but is
         * otherwise the same as [AuthorServiceAsync.update].
         */
        fun update(objectId: String, params: AuthorUpdateParams): CompletableFuture<HttpResponse> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: AuthorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: AuthorUpdateParams): CompletableFuture<HttpResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AuthorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor`, but is otherwise
         * the same as [AuthorServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponse> = list(AuthorListParams.none())

        /** @see list */
        fun list(
            params: AuthorListParams = AuthorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see list */
        fun list(
            params: AuthorListParams = AuthorListParams.none()
        ): CompletableFuture<HttpResponse> = list(params, RequestOptions.none())

        /** @see list */
        fun list(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            list(AuthorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/blogs/2026-03/authors/{objectId}`, but is
         * otherwise the same as [AuthorServiceAsync.delete].
         */
        fun delete(objectId: String): CompletableFuture<HttpResponse> =
            delete(objectId, AuthorDeleteParams.none())

        /** @see delete */
        fun delete(
            objectId: String,
            params: AuthorDeleteParams = AuthorDeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see delete */
        fun delete(
            objectId: String,
            params: AuthorDeleteParams = AuthorDeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(objectId, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AuthorDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AuthorDeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(objectId, AuthorDeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/authors/multi-language/attach-to-lang-group`, but is otherwise the
         * same as [AuthorServiceAsync.attachToLangGroup].
         */
        fun attachToLangGroup(
            params: AuthorAttachToLangGroupParams
        ): CompletableFuture<HttpResponse> = attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            params: AuthorAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(
                AuthorAttachToLangGroupParams.builder()
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
         * /cms/blogs/2026-03/authors/multi-language/create-language-variation`, but is otherwise
         * the same as [AuthorServiceAsync.createLanguageVariation].
         */
        fun createLanguageVariation(
            params: AuthorCreateLanguageVariationParams
        ): CompletableFuture<HttpResponse> = createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            params: AuthorCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            createLanguageVariation(
                AuthorCreateLanguageVariationParams.builder()
                    .blogAuthorCloneRequestVNext(blogAuthorCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext
        ): CompletableFuture<HttpResponse> =
            createLanguageVariation(blogAuthorCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/authors/multi-language/detach-from-lang-group`, but is otherwise the
         * same as [AuthorServiceAsync.detachFromLangGroup].
         */
        fun detachFromLangGroup(
            params: AuthorDetachFromLangGroupParams
        ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            params: AuthorDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(
                AuthorDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/{objectId}`, but is
         * otherwise the same as [AuthorServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponse> =
            get(objectId, AuthorGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: AuthorGetParams = AuthorGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: AuthorGetParams = AuthorGetParams.none(),
        ): CompletableFuture<HttpResponse> = get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: AuthorGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see get */
        fun get(params: AuthorGetParams): CompletableFuture<HttpResponse> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            get(objectId, AuthorGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/authors/cursor/query`, but is
         * otherwise the same as [AuthorServiceAsync.listByQuery].
         */
        fun listByQuery(): CompletableFuture<HttpResponse> =
            listByQuery(AuthorListByQueryParams.none())

        /** @see listByQuery */
        fun listByQuery(
            params: AuthorListByQueryParams = AuthorListByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listByQuery */
        fun listByQuery(
            params: AuthorListByQueryParams = AuthorListByQueryParams.none()
        ): CompletableFuture<HttpResponse> = listByQuery(params, RequestOptions.none())

        /** @see listByQuery */
        fun listByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listByQuery(AuthorListByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor`, but is otherwise
         * the same as [AuthorServiceAsync.listPosts].
         */
        fun listPosts(): CompletableFuture<HttpResponse> = listPosts(AuthorListPostsParams.none())

        /** @see listPosts */
        fun listPosts(
            params: AuthorListPostsParams = AuthorListPostsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listPosts */
        fun listPosts(
            params: AuthorListPostsParams = AuthorListPostsParams.none()
        ): CompletableFuture<HttpResponse> = listPosts(params, RequestOptions.none())

        /** @see listPosts */
        fun listPosts(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listPosts(AuthorListPostsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/posts/cursor/query`, but is
         * otherwise the same as [AuthorServiceAsync.listPostsByQuery].
         */
        fun listPostsByQuery(): CompletableFuture<HttpResponse> =
            listPostsByQuery(AuthorListPostsByQueryParams.none())

        /** @see listPostsByQuery */
        fun listPostsByQuery(
            params: AuthorListPostsByQueryParams = AuthorListPostsByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listPostsByQuery */
        fun listPostsByQuery(
            params: AuthorListPostsByQueryParams = AuthorListPostsByQueryParams.none()
        ): CompletableFuture<HttpResponse> = listPostsByQuery(params, RequestOptions.none())

        /** @see listPostsByQuery */
        fun listPostsByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listPostsByQuery(AuthorListPostsByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor`, but is otherwise
         * the same as [AuthorServiceAsync.listTags].
         */
        fun listTags(): CompletableFuture<HttpResponse> = listTags(AuthorListTagsParams.none())

        /** @see listTags */
        fun listTags(
            params: AuthorListTagsParams = AuthorListTagsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listTags */
        fun listTags(
            params: AuthorListTagsParams = AuthorListTagsParams.none()
        ): CompletableFuture<HttpResponse> = listTags(params, RequestOptions.none())

        /** @see listTags */
        fun listTags(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listTags(AuthorListTagsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cms/blogs/2026-03/tags/cursor/query`, but is
         * otherwise the same as [AuthorServiceAsync.listTagsByQuery].
         */
        fun listTagsByQuery(): CompletableFuture<HttpResponse> =
            listTagsByQuery(AuthorListTagsByQueryParams.none())

        /** @see listTagsByQuery */
        fun listTagsByQuery(
            params: AuthorListTagsByQueryParams = AuthorListTagsByQueryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see listTagsByQuery */
        fun listTagsByQuery(
            params: AuthorListTagsByQueryParams = AuthorListTagsByQueryParams.none()
        ): CompletableFuture<HttpResponse> = listTagsByQuery(params, RequestOptions.none())

        /** @see listTagsByQuery */
        fun listTagsByQuery(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            listTagsByQuery(AuthorListTagsByQueryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /cms/blogs/2026-03/authors/multi-language/set-new-lang-primary`, but is otherwise the
         * same as [AuthorServiceAsync.setNewLangPrimary].
         */
        fun setNewLangPrimary(
            params: AuthorSetNewLangPrimaryParams
        ): CompletableFuture<HttpResponse> = setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            params: AuthorSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            setNewLangPrimary(
                AuthorSetNewLangPrimaryParams.builder()
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
         * Returns a raw HTTP response for `post
         * /cms/blogs/2026-03/authors/multi-language/update-languages`, but is otherwise the same as
         * [AuthorServiceAsync.updateLanguages].
         */
        fun updateLanguages(params: AuthorUpdateLanguagesParams): CompletableFuture<HttpResponse> =
            updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        fun updateLanguages(
            params: AuthorUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateLanguages */
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLanguages(
                AuthorUpdateLanguagesParams.builder()
                    .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see updateLanguages */
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
        ): CompletableFuture<HttpResponse> =
            updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())
    }
}
