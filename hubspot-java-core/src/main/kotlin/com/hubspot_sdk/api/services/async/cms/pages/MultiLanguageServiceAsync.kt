// File generated from our OpenAPI spec by Stainless.

package com.hubspot_sdk.api.services.async.cms.pages

import com.hubspot_sdk.api.core.ClientOptions
import com.hubspot_sdk.api.core.RequestOptions
import com.hubspot_sdk.api.core.http.HttpResponse
import com.hubspot_sdk.api.core.http.HttpResponseFor
import com.hubspot_sdk.api.models.cms.AttachToLangPrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.DetachFromLangGroupRequestVNext
import com.hubspot_sdk.api.models.cms.SetNewLanguagePrimaryRequestVNext
import com.hubspot_sdk.api.models.cms.UpdateLanguagesRequestVNext
import com.hubspot_sdk.api.models.cms.pages.ContentLanguageCloneRequestVNext
import com.hubspot_sdk.api.models.cms.pages.Page
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageAttachToLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageCreateLanguageVariationParams
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageDetachFromLangGroupParams
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageSetNewLangPrimaryParams
import com.hubspot_sdk.api.models.cms.pages.multilanguage.MultiLanguageUpdateLanguagesParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MultiLanguageServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MultiLanguageServiceAsync

    /** Attach a site page to a multi-language group. */
    fun attachToLangGroup(
        params: MultiLanguageAttachToLangGroupParams
    ): CompletableFuture<HttpResponse> = attachToLangGroup(params, RequestOptions.none())

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        params: MultiLanguageAttachToLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(
            MultiLanguageAttachToLangGroupParams.builder()
                .attachToLangPrimaryRequestVNext(attachToLangPrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see attachToLangGroup */
    fun attachToLangGroup(
        attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext
    ): CompletableFuture<HttpResponse> =
        attachToLangGroup(attachToLangPrimaryRequestVNext, RequestOptions.none())

    /** Create a new language variation from an existing site page */
    fun createLanguageVariation(
        params: MultiLanguageCreateLanguageVariationParams
    ): CompletableFuture<Page> = createLanguageVariation(params, RequestOptions.none())

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        params: MultiLanguageCreateLanguageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page>

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Page> =
        createLanguageVariation(
            MultiLanguageCreateLanguageVariationParams.builder()
                .contentLanguageCloneRequestVNext(contentLanguageCloneRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLanguageVariation */
    fun createLanguageVariation(
        contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
    ): CompletableFuture<Page> =
        createLanguageVariation(contentLanguageCloneRequestVNext, RequestOptions.none())

    /** Detach a website page from a multi-language group. */
    fun detachFromLangGroup(
        params: MultiLanguageDetachFromLangGroupParams
    ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        params: MultiLanguageDetachFromLangGroupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(
            MultiLanguageDetachFromLangGroupParams.builder()
                .detachFromLangGroupRequestVNext(detachFromLangGroupRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see detachFromLangGroup */
    fun detachFromLangGroup(
        detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext
    ): CompletableFuture<HttpResponse> =
        detachFromLangGroup(detachFromLangGroupRequestVNext, RequestOptions.none())

    /** Set a site page as the primary language of a multi-language group. */
    fun setNewLangPrimary(params: MultiLanguageSetNewLangPrimaryParams): CompletableFuture<Void?> =
        setNewLangPrimary(params, RequestOptions.none())

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        params: MultiLanguageSetNewLangPrimaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        setNewLangPrimary(
            MultiLanguageSetNewLangPrimaryParams.builder()
                .setNewLanguagePrimaryRequestVNext(setNewLanguagePrimaryRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see setNewLangPrimary */
    fun setNewLangPrimary(
        setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext
    ): CompletableFuture<Void?> =
        setNewLangPrimary(setNewLanguagePrimaryRequestVNext, RequestOptions.none())

    /** Explicitly set new languages for each site page in a multi-language group. */
    fun updateLanguages(
        params: MultiLanguageUpdateLanguagesParams
    ): CompletableFuture<HttpResponse> = updateLanguages(params, RequestOptions.none())

    /** @see updateLanguages */
    fun updateLanguages(
        params: MultiLanguageUpdateLanguagesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse>

    /** @see updateLanguages */
    fun updateLanguages(
        updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HttpResponse> =
        updateLanguages(
            MultiLanguageUpdateLanguagesParams.builder()
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
     * A view of [MultiLanguageServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MultiLanguageServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/multi-language/attach-to-lang-group`, but is otherwise the
         * same as [MultiLanguageServiceAsync.attachToLangGroup].
         */
        fun attachToLangGroup(
            params: MultiLanguageAttachToLangGroupParams
        ): CompletableFuture<HttpResponse> = attachToLangGroup(params, RequestOptions.none())

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            params: MultiLanguageAttachToLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see attachToLangGroup */
        fun attachToLangGroup(
            attachToLangPrimaryRequestVNext: AttachToLangPrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            attachToLangGroup(
                MultiLanguageAttachToLangGroupParams.builder()
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
         * /cms/pages/2026-03/site-pages/multi-language/create-language-variation`, but is otherwise
         * the same as [MultiLanguageServiceAsync.createLanguageVariation].
         */
        fun createLanguageVariation(
            params: MultiLanguageCreateLanguageVariationParams
        ): CompletableFuture<HttpResponseFor<Page>> =
            createLanguageVariation(params, RequestOptions.none())

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            params: MultiLanguageCreateLanguageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>>

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Page>> =
            createLanguageVariation(
                MultiLanguageCreateLanguageVariationParams.builder()
                    .contentLanguageCloneRequestVNext(contentLanguageCloneRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLanguageVariation */
        fun createLanguageVariation(
            contentLanguageCloneRequestVNext: ContentLanguageCloneRequestVNext
        ): CompletableFuture<HttpResponseFor<Page>> =
            createLanguageVariation(contentLanguageCloneRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/site-pages/multi-language/detach-from-lang-group`, but is otherwise
         * the same as [MultiLanguageServiceAsync.detachFromLangGroup].
         */
        fun detachFromLangGroup(
            params: MultiLanguageDetachFromLangGroupParams
        ): CompletableFuture<HttpResponse> = detachFromLangGroup(params, RequestOptions.none())

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            params: MultiLanguageDetachFromLangGroupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see detachFromLangGroup */
        fun detachFromLangGroup(
            detachFromLangGroupRequestVNext: DetachFromLangGroupRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            detachFromLangGroup(
                MultiLanguageDetachFromLangGroupParams.builder()
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
         * Returns a raw HTTP response for `put
         * /cms/pages/2026-03/site-pages/multi-language/set-new-lang-primary`, but is otherwise the
         * same as [MultiLanguageServiceAsync.setNewLangPrimary].
         */
        fun setNewLangPrimary(
            params: MultiLanguageSetNewLangPrimaryParams
        ): CompletableFuture<HttpResponse> = setNewLangPrimary(params, RequestOptions.none())

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            params: MultiLanguageSetNewLangPrimaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see setNewLangPrimary */
        fun setNewLangPrimary(
            setNewLanguagePrimaryRequestVNext: SetNewLanguagePrimaryRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            setNewLangPrimary(
                MultiLanguageSetNewLangPrimaryParams.builder()
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
         * /cms/pages/2026-03/site-pages/multi-language/update-languages`, but is otherwise the same
         * as [MultiLanguageServiceAsync.updateLanguages].
         */
        fun updateLanguages(
            params: MultiLanguageUpdateLanguagesParams
        ): CompletableFuture<HttpResponse> = updateLanguages(params, RequestOptions.none())

        /** @see updateLanguages */
        fun updateLanguages(
            params: MultiLanguageUpdateLanguagesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see updateLanguages */
        fun updateLanguages(
            updateLanguagesRequestVNext: UpdateLanguagesRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            updateLanguages(
                MultiLanguageUpdateLanguagesParams.builder()
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
