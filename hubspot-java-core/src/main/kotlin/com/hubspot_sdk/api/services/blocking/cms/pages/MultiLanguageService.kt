// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.blocking.cms.pages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.pages.CmsPage
import com.hubspot_sdk.api.models.cms.pages.ContentLanguageCloneRequestVNext
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageUpdateLanguagesParams
import java.util.function.Consumer

interface MultiLanguageService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultiLanguageService

    /** Attach a site page to a multi-language group. */
    @MustBeClosed
    fun attachToLangGroup(params: MultiLanguageAttachToLangGroupParams): HttpResponse =
        attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        params: MultiLanguageAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        attachToLangGroup(
            MultiLanguageAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    @MustBeClosed
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): HttpResponse = attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create a new language variation from an existing site page */
    fun createLanguageVariation(params: MultiLanguageCreateLanguageVariationParams): CmsPage =
        createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: MultiLanguageCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CmsPage =
        createLanguageVariation(
            MultiLanguageCreateLanguageVariationParams.builder()
                .contentLanguageCloneRequestVNext(contentLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
    ): CmsPage = createLanguageVariation(contentLanguageCloneRequestVNext, RequestOptions.none())

    /** Detach a website page from a multi-language group. */
    @MustBeClosed
    fun detachFromLangGroup(params: MultiLanguageDetachFromLangGroupParams): HttpResponse =
        detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        params: MultiLanguageDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        detachFromLangGroup(
            MultiLanguageDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    @MustBeClosed
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): HttpResponse = detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Set a site page as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: MultiLanguageSetNewLangPrimaryParams) =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: MultiLanguageSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        setNewLangPrimary(
            MultiLanguageSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext) =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Explicitly set new languages for each site page in a multi-language group. */
    @MustBeClosed
    fun updateLanguages(params: MultiLanguageUpdateLanguagesParams): HttpResponse =
        updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    @MustBeClosed
    fun updateLanguages(
        params: MultiLanguageUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse

    /** @see updateLanguages */
    @MustBeClosed
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): HttpResponse =
        updateLanguages(
            MultiLanguageUpdateLanguagesParams.builder()
                .updateLanguagesRequestVNext(updateLanguagesRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see updateLanguages */
    @MustBeClosed
    fun updateLanguages(updateLanguagesRequestVNext: UpdateLanguagesRequestVNext): HttpResponse =
        updateLanguages(updateLanguagesRequestVNext, RequestOptions.none())

    /**
     * A view of [MultiLanguageService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultiLanguageService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/multi-language/attach-to-lang-group`, but is otherwise the
         * same as [MultiLanguageService.attachToLangGroup].
         */
        @MustBeClosed
        fun attachToLangGroup(params: MultiLanguageAttachToLangGroupParams): HttpResponse =
            attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            params: MultiLanguageAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see attachToLangGroup */
        @MustBeClosed
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            attachToLangGroup(
                MultiLanguageAttachToLangGroupParams.builder()
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
         * /cms/pages/2026-03/site-pages/multi-language/create-language-variation`, but is otherwise
         * the same as [MultiLanguageService.createLanguageVariation].
         */
        @MustBeClosed
        fun createLanguageVariation(
            params: MultiLanguageCreateLanguageVariationParams
        ): HttpResponseFor<CmsPage> = createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            params: MultiLanguageCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage>

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CmsPage> =
            createLanguageVariation(
                MultiLanguageCreateLanguageVariationParams.builder()
                    .contentLanguageCloneRequestVNext(contentLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLanguageVariation */
        @MustBeClosed
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
        ): HttpResponseFor<CmsPage> =
            createLanguageVariation(contentLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/multi-language/detach-from-lang-group`, but is otherwise
         * the same as [MultiLanguageService.detachFromLangGroup].
         */
        @MustBeClosed
        fun detachFromLangGroup(params: MultiLanguageDetachFromLangGroupParams): HttpResponse =
            detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            params: MultiLanguageDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see detachFromLangGroup */
        @MustBeClosed
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            detachFromLangGroup(
                MultiLanguageDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `put
         * /cms/pages/2026-03/site-pages/multi-language/set-new-lang-primary`, but is otherwise the
         * same as [MultiLanguageService.setNewLangPrimary].
         */
        @MustBeClosed
        fun setNewLangPrimary(params: MultiLanguageSetNewLangPrimaryParams): HttpResponse =
            setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            params: MultiLanguageSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see setNewLangPrimary */
        @MustBeClosed
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            setNewLangPrimary(
                MultiLanguageSetNewLangPrimaryParams.builder()
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
         * /cms/pages/2026-03/site-pages/multi-language/update-languages`, but is otherwise the same
         * as [MultiLanguageService.updateLanguages].
         */
        @MustBeClosed
        fun updateLanguages(params: MultiLanguageUpdateLanguagesParams): HttpResponse =
            updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            params: MultiLanguageUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see updateLanguages */
        @MustBeClosed
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            updateLanguages(
                MultiLanguageUpdateLanguagesParams.builder()
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
