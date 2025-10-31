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
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorCreateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDeleteBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDeleteParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorGetParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListPageAsync
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorListParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateBatchParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.blogs.authors.AuthorUpdateParams
import com.hubspot_sdk.api.models.cms.blogs.authors.BatchInputBlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BatchResponseBlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthor
import com.hubspot_sdk.api.models.cms.blogs.authors.BlogAuthorCloneRequestVNext
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

    /** Create a new Blog Author. */
    fun create(params: AuthorCreateParams): CompletableFuture<BlogAuthor> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthorCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogAuthor>

    /** @see create */
    fun create(
        blogAuthor: BlogAuthor,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogAuthor> =
        create(AuthorCreateParams.builder().blogAuthor(blogAuthor).build(), requestOptions)

    /** @see create */
    fun create(blogAuthor: BlogAuthor): CompletableFuture<BlogAuthor> =
        create(blogAuthor, RequestOptions.none())

    /**
     * Sparse updates a single Blog Author object identified by the id in the path. All the column
     * values need not be specified. Only the that need to be modified can be specified.
     */
    fun update(objectId: String, params: AuthorUpdateParams): CompletableFuture<BlogAuthor> =
        update(objectId, params, RequestOptions.none())

    /** @see update */
    fun update(
        objectId: String,
        params: AuthorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogAuthor> =
        update(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see update */
    fun update(params: AuthorUpdateParams): CompletableFuture<BlogAuthor> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AuthorUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogAuthor>

    /**
     * Get the list of blog authors. Supports paging and filtering. This method would be useful for
     * an integration that examined these models and used an external service to suggest edits.
     */
    fun list(): CompletableFuture<AuthorListPageAsync> = list(AuthorListParams.none())

    /** @see list */
    fun list(
        params: AuthorListParams = AuthorListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthorListPageAsync>

    /** @see list */
    fun list(
        params: AuthorListParams = AuthorListParams.none()
    ): CompletableFuture<AuthorListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AuthorListPageAsync> =
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
    fun attachToLangGroup(params: AuthorAttachToLangGroupParams): CompletableFuture<Void?> =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: AuthorAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        attachToLangGroup(
            AuthorAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<Void?> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create the Blog Author objects detailed in the request body. */
    fun createBatch(params: AuthorCreateBatchParams): CompletableFuture<BatchResponseBlogAuthor> =
        createBatch(params, RequestOptions.none())

    /** @see createBatch */
    fun createBatch(
        params: AuthorCreateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogAuthor>

    /** @see createBatch */
    fun createBatch(
        batchInputBlogAuthor: BatchInputBlogAuthor,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogAuthor> =
        createBatch(
            AuthorCreateBatchParams.builder().batchInputBlogAuthor(batchInputBlogAuthor).build(),
            requestOptions,
        )

    /** @see createBatch */
    fun createBatch(
        batchInputBlogAuthor: BatchInputBlogAuthor
    ): CompletableFuture<BatchResponseBlogAuthor> =
        createBatch(batchInputBlogAuthor, RequestOptions.none())

    /** Create a new language variation from an existing Blog Author. */
    fun createLanguageVariation(
        params: AuthorCreateLanguageVariationParams
    ): CompletableFuture<BlogAuthor> = createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: AuthorCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogAuthor>

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogAuthor> =
        createLanguageVariation(
            AuthorCreateLanguageVariationParams.builder()
                .blogAuthorCloneRequestVNext(blogAuthorCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext
    ): CompletableFuture<BlogAuthor> =
        createLanguageVariation(blogAuthorCloneRequestVNext, RequestOptions.none())

    /** Delete the Blog Author objects identified in the request body. */
    fun deleteBatch(params: AuthorDeleteBatchParams): CompletableFuture<Void?> =
        deleteBatch(params, RequestOptions.none())

    /** @see deleteBatch */
    fun deleteBatch(
        params: AuthorDeleteBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see deleteBatch */
    fun deleteBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        deleteBatch(
            AuthorDeleteBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see deleteBatch */
    fun deleteBatch(batchInputString: BatchInputString): CompletableFuture<Void?> =
        deleteBatch(batchInputString, RequestOptions.none())

    /** Detach a Blog Author from a multi-language group. */
    fun detachFromLangGroup(params: AuthorDetachFromLangGroupParams): CompletableFuture<Void?> =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: AuthorDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        detachFromLangGroup(
            AuthorDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<Void?> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Retrieve the Blog Author object identified by the id in the path. */
    fun get(objectId: String): CompletableFuture<BlogAuthor> = get(objectId, AuthorGetParams.none())

    /** @see get */
    fun get(
        objectId: String,
        params: AuthorGetParams = AuthorGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogAuthor> =
        get(params.toBuilder().objectId(objectId).build(), requestOptions)

    /** @see get */
    fun get(
        objectId: String,
        params: AuthorGetParams = AuthorGetParams.none(),
    ): CompletableFuture<BlogAuthor> = get(objectId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: AuthorGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlogAuthor>

    /** @see get */
    fun get(params: AuthorGetParams): CompletableFuture<BlogAuthor> =
        get(params, RequestOptions.none())

    /** @see get */
    fun get(objectId: String, requestOptions: RequestOptions): CompletableFuture<BlogAuthor> =
        get(objectId, AuthorGetParams.none(), requestOptions)

    /** Retrieve the Blog Author objects identified in the request body. */
    fun getBatch(params: AuthorGetBatchParams): CompletableFuture<BatchResponseBlogAuthor> =
        getBatch(params, RequestOptions.none())

    /** @see getBatch */
    fun getBatch(
        params: AuthorGetBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogAuthor>

    /** @see getBatch */
    fun getBatch(
        batchInputString: BatchInputString,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogAuthor> =
        getBatch(
            AuthorGetBatchParams.builder().batchInputString(batchInputString).build(),
            requestOptions,
        )

    /** @see getBatch */
    fun getBatch(batchInputString: BatchInputString): CompletableFuture<BatchResponseBlogAuthor> =
        getBatch(batchInputString, RequestOptions.none())

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

    /** Update the Blog Author objects identified in the request body. */
    fun updateBatch(params: AuthorUpdateBatchParams): CompletableFuture<BatchResponseBlogAuthor> =
        updateBatch(params, RequestOptions.none())

    /** @see updateBatch */
    fun updateBatch(
        params: AuthorUpdateBatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogAuthor>

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BatchResponseBlogAuthor> =
        updateBatch(
            AuthorUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
            requestOptions,
        )

    /** @see updateBatch */
    fun updateBatch(
        batchInputJsonNode: BatchInputJsonNode
    ): CompletableFuture<BatchResponseBlogAuthor> =
        updateBatch(batchInputJsonNode, RequestOptions.none())

    /** Explicitly set new languages for each Blog Author in a multi-language group. */
    fun updateLanguages(params: AuthorUpdateLanguagesParams): CompletableFuture<Void?> =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: AuthorUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateLanguages(
            AuthorUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
    ): CompletableFuture<Void?> =
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

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors`, but is otherwise the same
         * as [AuthorServiceAsync.create].
         */
        fun create(params: AuthorCreateParams): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AuthorCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogAuthor>>

        /** @see create */
        fun create(
            blogAuthor: BlogAuthor,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            create(AuthorCreateParams.builder().blogAuthor(blogAuthor).build(), requestOptions)

        /** @see create */
        fun create(blogAuthor: BlogAuthor): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            create(blogAuthor, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `patch /cms/v3/blogs/authors/{objectId}`, but is
         * otherwise the same as [AuthorServiceAsync.update].
         */
        fun update(
            objectId: String,
            params: AuthorUpdateParams,
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            update(objectId, params, RequestOptions.none())

        /** @see update */
        fun update(
            objectId: String,
            params: AuthorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            update(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see update */
        fun update(params: AuthorUpdateParams): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AuthorUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogAuthor>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blogs/authors`, but is otherwise the same as
         * [AuthorServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AuthorListPageAsync>> =
            list(AuthorListParams.none())

        /** @see list */
        fun list(
            params: AuthorListParams = AuthorListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthorListPageAsync>>

        /** @see list */
        fun list(
            params: AuthorListParams = AuthorListParams.none()
        ): CompletableFuture<HttpResponseFor<AuthorListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AuthorListPageAsync>> =
            list(AuthorListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /cms/v3/blogs/authors/{objectId}`, but is
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
         * /cms/v3/blogs/authors/multi-language/attach-to-lang-group`, but is otherwise the same as
         * [AuthorServiceAsync.attachToLangGroup].
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors/batch/create`, but is
         * otherwise the same as [AuthorServiceAsync.createBatch].
         */
        fun createBatch(
            params: AuthorCreateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> =
            createBatch(params, RequestOptions.none())

        /** @see createBatch */
        fun createBatch(
            params: AuthorCreateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>>

        /** @see createBatch */
        fun createBatch(
            batchInputBlogAuthor: BatchInputBlogAuthor,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> =
            createBatch(
                AuthorCreateBatchParams.builder()
                    .batchInputBlogAuthor(batchInputBlogAuthor)
                    .build(),
                requestOptions,
            )

        /** @see createBatch */
        fun createBatch(
            batchInputBlogAuthor: BatchInputBlogAuthor
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> =
            createBatch(batchInputBlogAuthor, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/authors/multi-language/create-language-variation`, but is otherwise the
         * same as [AuthorServiceAsync.createLanguageVariation].
         */
        fun createLanguageVariation(
            params: AuthorCreateLanguageVariationParams
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            params: AuthorCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogAuthor>>

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            createLanguageVariation(
                AuthorCreateLanguageVariationParams.builder()
                    .blogAuthorCloneRequestVNext(blogAuthorCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            blogAuthorCloneRequestVNext: BlogAuthorCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            createLanguageVariation(blogAuthorCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors/batch/archive`, but is
         * otherwise the same as [AuthorServiceAsync.deleteBatch].
         */
        fun deleteBatch(params: AuthorDeleteBatchParams): CompletableFuture<HttpResponse> =
            deleteBatch(params, RequestOptions.none())

        /** @see deleteBatch */
        fun deleteBatch(
            params: AuthorDeleteBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see deleteBatch */
        fun deleteBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            deleteBatch(
                AuthorDeleteBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see deleteBatch */
        fun deleteBatch(batchInputString: BatchInputString): CompletableFuture<HttpResponse> =
            deleteBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/authors/multi-language/detach-from-lang-group`, but is otherwise the same
         * as [AuthorServiceAsync.detachFromLangGroup].
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
         * Returns a raw HTTP response for `get /cms/v3/blogs/authors/{objectId}`, but is otherwise
         * the same as [AuthorServiceAsync.get].
         */
        fun get(objectId: String): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            get(objectId, AuthorGetParams.none())

        /** @see get */
        fun get(
            objectId: String,
            params: AuthorGetParams = AuthorGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            get(params.toBuilder().objectId(objectId).build(), requestOptions)

        /** @see get */
        fun get(
            objectId: String,
            params: AuthorGetParams = AuthorGetParams.none(),
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            get(objectId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: AuthorGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlogAuthor>>

        /** @see get */
        fun get(params: AuthorGetParams): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            objectId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BlogAuthor>> =
            get(objectId, AuthorGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors/batch/read`, but is otherwise
         * the same as [AuthorServiceAsync.getBatch].
         */
        fun getBatch(
            params: AuthorGetBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> =
            getBatch(params, RequestOptions.none())

        /** @see getBatch */
        fun getBatch(
            params: AuthorGetBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>>

        /** @see getBatch */
        fun getBatch(
            batchInputString: BatchInputString,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> =
            getBatch(
                AuthorGetBatchParams.builder().batchInputString(batchInputString).build(),
                requestOptions,
            )

        /** @see getBatch */
        fun getBatch(
            batchInputString: BatchInputString
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> =
            getBatch(batchInputString, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/blogs/authors/multi-language/set-new-lang-primary`, but is otherwise the same as
         * [AuthorServiceAsync.setNewLangPrimary].
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
         * Returns a raw HTTP response for `post /cms/v3/blogs/authors/batch/update`, but is
         * otherwise the same as [AuthorServiceAsync.updateBatch].
         */
        fun updateBatch(
            params: AuthorUpdateBatchParams
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> =
            updateBatch(params, RequestOptions.none())

        /** @see updateBatch */
        fun updateBatch(
            params: AuthorUpdateBatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>>

        /** @see updateBatch */
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> =
            updateBatch(
                AuthorUpdateBatchParams.builder().batchInputJsonNode(batchInputJsonNode).build(),
                requestOptions,
            )

        /** @see updateBatch */
        fun updateBatch(
            batchInputJsonNode: BatchInputJsonNode
        ): CompletableFuture<HttpResponseFor<BatchResponseBlogAuthor>> =
            updateBatch(batchInputJsonNode, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blogs/authors/multi-language/update-languages`, but is otherwise the same as
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
