// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.blogs

import com.google.errorprone.annotations.MustBeClosed
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
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingGetRevisionParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListPage
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsPage
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingListRevisionsParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.blogs.settings.SettingUpdateLanguagesParams
import com.hubspot_sdk.api.models.cms.blogs.settings.VersionBlog
import java.util.function.Consumer

interface SettingService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService

    fun list(): SettingListPage = list(SettingListParams.none())

    /** @see list */
    fun list(
        params: SettingListParams = SettingListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingListPage

    /** @see list */
    fun list(params: SettingListParams = SettingListParams.none()): SettingListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): SettingListPage =
        list(SettingListParams.none(), requestOptions)

    fun attachToLangGroup(params: SettingAttachToLangGroupParams) =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: SettingAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        attachToLangGroup(
            SettingAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext) =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    fun createLanguageVariation(params: SettingCreateLanguageVariationParams): Blog =
        createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: SettingCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Blog

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogLanguageCloneRequestVNext: BlogLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Blog =
        createLanguageVariation(
            SettingCreateLanguageVariationParams.builder()
                .blogLanguageCloneRequestVNext(blogLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        blogLanguageCloneRequestVNext: BlogLanguageCloneRequestVNext
    ): Blog = createLanguageVariation(blogLanguageCloneRequestVNext, RequestOptions.none())

    fun detachFromLangGroup(params: SettingDetachFromLangGroupParams) =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: SettingDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        detachFromLangGroup(
            SettingDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext) =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    fun get(blogId: String): Blog = get(blogId, SettingGetParams.none())

    /** @see get */
    fun get(
        blogId: String,
        params: SettingGetParams = SettingGetParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Blog = get(params.toBuilder().blogId(blogId).build(), requestOptions)

    /** @see get */
    fun get(blogId: String, params: SettingGetParams = SettingGetParams.none()): Blog =
        get(blogId, params, RequestOptions.none())

    /** @see get */
    fun get(params: SettingGetParams, requestOptions: RequestOptions = RequestOptions.none()): Blog

    /** @see get */
    fun get(params: SettingGetParams): Blog = get(params, RequestOptions.none())

    /** @see get */
    fun get(blogId: String, requestOptions: RequestOptions): Blog =
        get(blogId, SettingGetParams.none(), requestOptions)

    fun getRevision(revisionId: String, params: SettingGetRevisionParams): VersionBlog =
        getRevision(revisionId, params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        revisionId: String,
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionBlog = getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

    /** @see getRevision */
    fun getRevision(params: SettingGetRevisionParams): VersionBlog =
        getRevision(params, RequestOptions.none())

    /** @see getRevision */
    fun getRevision(
        params: SettingGetRevisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VersionBlog

    fun listRevisions(blogId: String): SettingListRevisionsPage =
        listRevisions(blogId, SettingListRevisionsParams.none())

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingListRevisionsPage =
        listRevisions(params.toBuilder().blogId(blogId).build(), requestOptions)

    /** @see listRevisions */
    fun listRevisions(
        blogId: String,
        params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
    ): SettingListRevisionsPage = listRevisions(blogId, params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(
        params: SettingListRevisionsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettingListRevisionsPage

    /** @see listRevisions */
    fun listRevisions(params: SettingListRevisionsParams): SettingListRevisionsPage =
        listRevisions(params, RequestOptions.none())

    /** @see listRevisions */
    fun listRevisions(blogId: String, requestOptions: RequestOptions): SettingListRevisionsPage =
        listRevisions(blogId, SettingListRevisionsParams.none(), requestOptions)

    fun setNewLangPrimary(params: SettingSetNewLangPrimaryParams) =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: SettingSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        setNewLangPrimary(
            SettingSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext) =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    fun updateLanguages(params: SettingUpdateLanguagesParams) =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: SettingUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        updateLanguages(
            SettingUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLanguages */
    fun updateLanguages(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext) =
        updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())

    /** A view of [SettingService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettingService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /cms/v3/blog-settings/settings`, but is otherwise
         * the same as [SettingService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<SettingListPage> = list(SettingListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: SettingListParams = SettingListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: SettingListParams = SettingListParams.none()
        ): HttpResponseFor<SettingListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SettingListPage> =
            list(SettingListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blog-settings/settings/multi-language/attach-to-lang-group`, but is otherwise the
         * same as [SettingService.attachToLangGroup].
         */
        @MustBeClosed
        fun attachToLangGroup(params: SettingAttachToLangGroupParams): HttpResponse =
            attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            params: SettingAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            attachToLangGroup(
                SettingAttachToLangGroupParams.builder()
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
         * Returns a raw HTTP response for `post
         * /cms/v3/blog-settings/settings/multi-language/create-language-variation`, but is
         * otherwise the same as [SettingService.createLanguageVariation].
         */
        @MustBeClosed
        fun createLanguageVariation(
            params: SettingCreateLanguageVariationParams
        ): HttpResponseFor<Blog> = createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            params: SettingCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Blog>

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            blogLanguageCloneRequestVNext: BlogLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Blog> =
            createLanguageVariation(
                SettingCreateLanguageVariationParams.builder()
                    .blogLanguageCloneRequestVNext(blogLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            blogLanguageCloneRequestVNext: BlogLanguageCloneRequestVNext
        ): HttpResponseFor<Blog> =
            createLanguageVariation(blogLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blog-settings/settings/multi-language/detach-from-lang-group`, but is otherwise
         * the same as [SettingService.detachFromLangGroup].
         */
        @MustBeClosed
        fun detachFromLangGroup(params: SettingDetachFromLangGroupParams): HttpResponse =
            detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            params: SettingDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            detachFromLangGroup(
                SettingDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `get /cms/v3/blog-settings/settings/{blogId}`, but is
         * otherwise the same as [SettingService.get].
         */
        @MustBeClosed
        fun get(blogId: String): HttpResponseFor<Blog> = get(blogId, SettingGetParams.none())

        /** @see get */
        @MustBeClosed
        fun get(
            blogId: String,
            params: SettingGetParams = SettingGetParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Blog> = get(params.toBuilder().blogId(blogId).build(), requestOptions)

        /** @see get */
        @MustBeClosed
        fun get(
            blogId: String,
            params: SettingGetParams = SettingGetParams.none(),
        ): HttpResponseFor<Blog> = get(blogId, params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(
            params: SettingGetParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Blog>

        /** @see get */
        @MustBeClosed
        fun get(params: SettingGetParams): HttpResponseFor<Blog> =
            get(params, RequestOptions.none())

        /** @see get */
        @MustBeClosed
        fun get(blogId: String, requestOptions: RequestOptions): HttpResponseFor<Blog> =
            get(blogId, SettingGetParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /cms/v3/blog-settings/settings/{blogId}/revisions/{revisionId}`, but is otherwise the
         * same as [SettingService.getRevision].
         */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: SettingGetRevisionParams,
        ): HttpResponseFor<VersionBlog> = getRevision(revisionId, params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            revisionId: String,
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionBlog> =
            getRevision(params.toBuilder().revisionId(revisionId).build(), requestOptions)

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(params: SettingGetRevisionParams): HttpResponseFor<VersionBlog> =
            getRevision(params, RequestOptions.none())

        /** @see getRevision */
        @MustBeClosed
        fun getRevision(
            params: SettingGetRevisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VersionBlog>

        /**
         * Returns a raw HTTP response for `get /cms/v3/blog-settings/settings/{blogId}/revisions`,
         * but is otherwise the same as [SettingService.listRevisions].
         */
        @MustBeClosed
        fun listRevisions(blogId: String): HttpResponseFor<SettingListRevisionsPage> =
            listRevisions(blogId, SettingListRevisionsParams.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            blogId: String,
            params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingListRevisionsPage> =
            listRevisions(params.toBuilder().blogId(blogId).build(), requestOptions)

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            blogId: String,
            params: SettingListRevisionsParams = SettingListRevisionsParams.none(),
        ): HttpResponseFor<SettingListRevisionsPage> =
            listRevisions(blogId, params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: SettingListRevisionsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettingListRevisionsPage>

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            params: SettingListRevisionsParams
        ): HttpResponseFor<SettingListRevisionsPage> = listRevisions(params, RequestOptions.none())

        /** @see listRevisions */
        @MustBeClosed
        fun listRevisions(
            blogId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettingListRevisionsPage> =
            listRevisions(blogId, SettingListRevisionsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `put
         * /cms/v3/blog-settings/settings/multi-language/set-new-lang-primary`, but is otherwise the
         * same as [SettingService.setNewLangPrimary].
         */
        @MustBeClosed
        fun setNewLangPrimary(params: SettingSetNewLangPrimaryParams): HttpResponse =
            setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            params: SettingSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            setNewLangPrimary(
                SettingSetNewLangPrimaryParams.builder()
                    .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
        ): HttpResponse =
            setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/v3/blog-settings/settings/multi-language/update-languages`, but is otherwise the
         * same as [SettingService.updateLanguages].
         */
        @MustBeClosed
        fun updateLanguages(params: SettingUpdateLanguagesParams): HttpResponse =
            updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            params: SettingUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLanguages(
                SettingUpdateLanguagesParams.builder()
                    .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext
        ): HttpResponse = updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())
    }
}
