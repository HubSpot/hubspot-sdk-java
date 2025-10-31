// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.blogs

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.settings.Blog
import com.hubspot_sdk.api.models.cms.blogs.settings.BlogLanguageCloneRequestVNext
import com.hubspot_sdk.api.models.cms.blogs.settings.CollectionResponseWithTotalVersionBlog
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetRevisionParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListPageAsync
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.blogs.settings.VersionBlog
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SettingServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingServiceAsync

    fun list(): CompletableFuture<SettingListPageAsync> = list(SettingListParams.none())

    /** @see list */
    fun list(
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettingListPageAsync>

    /** @see list */
    fun list(
        params: SettingListParams = SettingListParams.none()
    ): CompletableFuture<SettingListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<SettingListPageAsync> =
        list(SettingListParams.none(), requestOptions)

    fun attachToLangGroup(params: SettingAttachToLangGroupParams): CompletableFuture<Void?> =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: SettingAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        attachToLangGroup(
            SettingAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<Void?> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    fun createLanguageVariation(
        params: SettingCreateLanguageVariationParams
    ): CompletableFuture<Blog> = createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: SettingCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Blog>

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogLanguageCloneRequestVNext: BlogLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Blog> =
        createLanguageVariation(
            SettingCreateLanguageVariationParams.builder()
                .blogLanguageCloneRequestVNext(blogLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogLanguageCloneRequestVNext: BlogLanguageCloneRequestVNext
    ): CompletableFuture<Blog> =
        createLanguageVariation(blogLanguageCloneRequestVNext, RequestOptions.none())

    fun detachFromLangGroup(params: SettingDetachFromLangGroupParams): CompletableFuture<Void?> =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: SettingDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        detachFromLangGroup(
            SettingDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<Void?> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    fun get(blogId: String): CompletableFuture<Blog> = get(blogId, SettingGetParams.none())

    /** @see get */
    fun get(
        blogId: String,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Blog> = get(params.toBuilder().blogId(blogId).build(), requestOptions)

    /** @see get */
    fun get(
        blogId: String,
        params: SettingGetParams = SettingGetParams.none(),
    ): CompletableFuture<Blog> = get(blogId, params, RequestOptions.none())

    /** @see get */
    fun get(
        params: SettingGetParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Blog>

    /** @see get */
    fun get(params: SettingGetParams): CompletableFuture<Blog> = get(params, RequestOptions.none())

    /** @see get */
    fun get(blogId: String, requestOptions: RequestOptions): CompletableFuture<Blog> =
        get(blogId, SettingGetParams.none(), requestOptions)

    fun getRevision(
        revisionId: String,
        params: SettingGetRevisionParams,
    ): CompletableFuture<VersionBlog> = getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionBlog> =
        getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: SettingGetRevisionParams): CompletableFuture<VersionBlog> =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VersionBlog>

    fun listRevisions(blogId: String): CompletableFuture<CollectionResponseWithTotalVersionBlog> =
        listRevisions(blogId, SettingListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalVersionBlog> =
        listRevisions(params.toBuilder().blogId(blogId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
    ): CompletableFuture<CollectionResponseWithTotalVersionBlog> =
        listRevisions(blogId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: SettingListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CollectionResponseWithTotalVersionBlog>

    /** @see listRevisions */
    fun listRevisions(
        params: SettingListRevisionsParams
    ): CompletableFuture<CollectionResponseWithTotalVersionBlog> =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CollectionResponseWithTotalVersionBlog> =
        listRevisions(blogId, SettingListRevisionsParams.none(), requestOptions)

    fun setNewLangPrimary(params: SettingSetNewLangPrimaryParams): CompletableFuture<Void?> =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: SettingSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        setNewLangPrimary(
            SettingSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
    ): CompletableFuture<Void?> =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    fun updateLanguages(params: SettingUpdateLanguagesParams): CompletableFuture<Void?> =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: SettingUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        updateLanguages(
            SettingUpdateLanguagesParams.builder()
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
     * A view of [SettingServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettingServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/v3/blog-settings/settings`, but is otherwise
         * the same as [SettingServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<SettingListPageAsync>> =
            list(SettingListParams.none())

        /** @see list */
        fun list(
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettingListPageAsync>>

        /** @see list */
        fun list(
            params: SettingListParams = SettingListParams.none()
        ): CompletableFuture<HttpResponseFor<SettingListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<SettingListPageAsync>> =
            list(SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blog-settings/settings/multi-language/attach-to-lang-group`, but is otherwise the
         * same as [SettingServiceAsync.attachToLangGroup].
         */
        fun attachToLangGroup(
            params: SettingAttachToLangGroupParams
        ): CompletableFuture<HttpResponse> = attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            params: SettingAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(
                SettingAttachToLangGroupParams.builder()
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
         * /cms/v3/blog-settings/settings/multi-language/create-language-variation`, but is
         * otherwise the same as [SettingServiceAsync.createLanguageVariation].
         */
        fun createLanguageVariation(
            params: SettingCreateLanguageVariationParams
        ): CompletableFuture<HttpResponseFor<Blog>> =
            createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            params: SettingCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Blog>>

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            blogLanguageCloneRequestVNext: BlogLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Blog>> =
            createLanguageVariation(
                SettingCreateLanguageVariationParams.builder()
                    .blogLanguageCloneRequestVNext(blogLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            blogLanguageCloneRequestVNext: BlogLanguageCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<Blog>> =
            createLanguageVariation(blogLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blog-settings/settings/multi-language/detach-from-lang-group`, but is otherwise
         * the same as [SettingServiceAsync.detachFromLangGroup].
         */
        fun detachFromLangGroup(
            params: SettingDetachFromLangGroupParams
        ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            params: SettingDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(
                SettingDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `get /cms/v3/blog-settings/settings/{blogId}`, but is
         * otherwise the same as [SettingServiceAsync.get].
         */
        fun get(blogId: String): CompletableFuture<HttpResponseFor<Blog>> =
            get(blogId, SettingGetParams.none())

        /** @see get */
        fun get(
            blogId: String,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Blog>> =
            get(params.toBuilder().blogId(blogId).build(), requestOptions)

        /** @see get */
        fun get(
            blogId: String,
            params: SettingGetParams = SettingGetParams.none(),
        ): CompletableFuture<HttpResponseFor<Blog>> = get(blogId, params, RequestOptions.none())

        /** @see get */
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Blog>>

        /** @see get */
        fun get(params: SettingGetParams): CompletableFuture<HttpResponseFor<Blog>> =
            get(params, RequestOptions.none())

        /** @see get */
        fun get(
            blogId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Blog>> =
            get(blogId, SettingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/blog-settings/settings/{blogId}/revisions/{revisionId}`, but is otherwise the
         * same as [SettingServiceAsync.getRevision].
         */
        fun getRevision(
            revisionId: String,
            params: SettingGetRevisionParams,
        ): CompletableFuture<HttpResponseFor<VersionBlog>> =
            getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            revisionId: String,
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionBlog>> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        fun getRevision(
            params: SettingGetRevisionParams
        ): CompletableFuture<HttpResponseFor<VersionBlog>> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        fun getRevision(
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VersionBlog>>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blog-settings/settings/{blogId}/revisions`,
         * but is otherwise the same as [SettingServiceAsync.listRevisions].
         */
        fun listRevisions(
            blogId: String
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalVersionBlog>> =
            listRevisions(blogId, SettingListRevisionsParams.none())

        /** @see listRevisions */
        fun listRevisions(
            blogId: String,
            params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalVersionBlog>> =
            listRevisions(params.toBuilder().blogId(blogId).build(), requestOptions)

        /** @see listRevisions */
        fun listRevisions(
            blogId: String,
            params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalVersionBlog>> =
            listRevisions(blogId, params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            params: SettingListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalVersionBlog>>

        /** @see listRevisions */
        fun listRevisions(
            params: SettingListRevisionsParams
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalVersionBlog>> =
            listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        fun listRevisions(
            blogId: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CollectionResponseWithTotalVersionBlog>> =
            listRevisions(blogId, SettingListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/blog-settings/settings/multi-language/set-new-lang-primary`, but is otherwise the
         * same as [SettingServiceAsync.setNewLangPrimary].
         */
        fun setNewLangPrimary(
            params: SettingSetNewLangPrimaryParams
        ): CompletableFuture<HttpResponse> = setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            params: SettingSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            setNewLangPrimary(
                SettingSetNewLangPrimaryParams.builder()
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
         * /cms/v3/blog-settings/settings/multi-language/update-languages`, but is otherwise the
         * same as [SettingServiceAsync.updateLanguages].
         */
        fun updateLanguages(params: SettingUpdateLanguagesParams): CompletableFuture<HttpResponse> =
            updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        fun updateLanguages(
            params: SettingUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateLanguages */
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLanguages(
                SettingUpdateLanguagesParams.builder()
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
