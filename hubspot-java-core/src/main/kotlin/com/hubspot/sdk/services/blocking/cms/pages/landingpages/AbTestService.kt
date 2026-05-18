// File generated from our OpenAPI spec by Stainless.

package com.hubspot.sdk.services.blocking.cms.pages.landingpages

import com.google.errorprone.annotations.MustBeClosed
import com.hubspot.sdk.core.ClientOptions
import com.hubspot.sdk.core.RequestOptions
import com.hubspot.sdk.core.http.HttpResponse
import com.hubspot.sdk.core.http.HttpResponseFor
import com.hubspot.sdk.models.AbTestCreateRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestEndRequestVNext
import com.hubspot.sdk.models.cms.pages.AbTestRerunRequestVNext
import com.hubspot.sdk.models.cms.pages.PagesPage
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestCreateLandingPageVariationParams
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestEndLandingPageTestParams
import com.hubspot.sdk.models.cms.pages.landingpages.abtest.AbTestRerunLandingPageTestParams
import java.util.function.Consumer

interface AbTestService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AbTestService

    /** Create a new A/B test variation based on the information provided in the request body. */
    fun createLandingPageVariation(params: AbTestCreateLandingPageVariationParams): PagesPage =
        createLandingPageVariation(params, RequestOptions.none())

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        params: AbTestCreateLandingPageVariationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(
        abTestCreateRequestVNext: AbTestCreateRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PagesPage =
        createLandingPageVariation(
            AbTestCreateLandingPageVariationParams.builder()
                .abTestCreateRequestVNext(abTestCreateRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see createLandingPageVariation */
    fun createLandingPageVariation(abTestCreateRequestVNext: AbTestCreateRequestVNext): PagesPage =
        createLandingPageVariation(abTestCreateRequestVNext, RequestOptions.none())

    /** End an active A/B test and designate a winner. */
    fun endLandingPageTest(params: AbTestEndLandingPageTestParams) =
        endLandingPageTest(params, RequestOptions.none())

    /** @see endLandingPageTest */
    fun endLandingPageTest(
        params: AbTestEndLandingPageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see endLandingPageTest */
    fun endLandingPageTest(
        abTestEndRequestVNext: AbTestEndRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        endLandingPageTest(
            AbTestEndLandingPageTestParams.builder()
                .abTestEndRequestVNext(abTestEndRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see endLandingPageTest */
    fun endLandingPageTest(abTestEndRequestVNext: AbTestEndRequestVNext) =
        endLandingPageTest(abTestEndRequestVNext, RequestOptions.none())

    /** Rerun a previous A/B test. */
    fun rerunLandingPageTest(params: AbTestRerunLandingPageTestParams) =
        rerunLandingPageTest(params, RequestOptions.none())

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        params: AbTestRerunLandingPageTestParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(
        abTestRerunRequestVNext: AbTestRerunRequestVNext,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        rerunLandingPageTest(
            AbTestRerunLandingPageTestParams.builder()
                .abTestRerunRequestVNext(abTestRerunRequestVNext)
                .build(),
            requestOptions,
        )

    /** @see rerunLandingPageTest */
    fun rerunLandingPageTest(abTestRerunRequestVNext: AbTestRerunRequestVNext) =
        rerunLandingPageTest(abTestRerunRequestVNext, RequestOptions.none())

    /** A view of [AbTestService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AbTestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /cms/pages/2026-03/landing-pages/ab-test/create-variation`, but is otherwise the same as
         * [AbTestService.createLandingPageVariation].
         */
        @MustBeClosed
        fun createLandingPageVariation(
            params: AbTestCreateLandingPageVariationParams
        ): HttpResponseFor<PagesPage> = createLandingPageVariation(params, RequestOptions.none())

        /** @see createLandingPageVariation */
        @MustBeClosed
        fun createLandingPageVariation(
            params: AbTestCreateLandingPageVariationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage>

        /** @see createLandingPageVariation */
        @MustBeClosed
        fun createLandingPageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PagesPage> =
            createLandingPageVariation(
                AbTestCreateLandingPageVariationParams.builder()
                    .abTestCreateRequestVNext(abTestCreateRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see createLandingPageVariation */
        @MustBeClosed
        fun createLandingPageVariation(
            abTestCreateRequestVNext: AbTestCreateRequestVNext
        ): HttpResponseFor<PagesPage> =
            createLandingPageVariation(abTestCreateRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/ab-test/end`, but
         * is otherwise the same as [AbTestService.endLandingPageTest].
         */
        @MustBeClosed
        fun endLandingPageTest(params: AbTestEndLandingPageTestParams): HttpResponse =
            endLandingPageTest(params, RequestOptions.none())

        /** @see endLandingPageTest */
        @MustBeClosed
        fun endLandingPageTest(
            params: AbTestEndLandingPageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see endLandingPageTest */
        @MustBeClosed
        fun endLandingPageTest(
            abTestEndRequestVNext: AbTestEndRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            endLandingPageTest(
                AbTestEndLandingPageTestParams.builder()
                    .abTestEndRequestVNext(abTestEndRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see endLandingPageTest */
        @MustBeClosed
        fun endLandingPageTest(abTestEndRequestVNext: AbTestEndRequestVNext): HttpResponse =
            endLandingPageTest(abTestEndRequestVNext, RequestOptions.none())

        /**
         * Returns a raw HTTP response for `post /cms/pages/2026-03/landing-pages/ab-test/rerun`,
         * but is otherwise the same as [AbTestService.rerunLandingPageTest].
         */
        @MustBeClosed
        fun rerunLandingPageTest(params: AbTestRerunLandingPageTestParams): HttpResponse =
            rerunLandingPageTest(params, RequestOptions.none())

        /** @see rerunLandingPageTest */
        @MustBeClosed
        fun rerunLandingPageTest(
            params: AbTestRerunLandingPageTestParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see rerunLandingPageTest */
        @MustBeClosed
        fun rerunLandingPageTest(
            abTestRerunRequestVNext: AbTestRerunRequestVNext,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            rerunLandingPageTest(
                AbTestRerunLandingPageTestParams.builder()
                    .abTestRerunRequestVNext(abTestRerunRequestVNext)
                    .build(),
                requestOptions,
            )

        /** @see rerunLandingPageTest */
        @MustBeClosed
        fun rerunLandingPageTest(abTestRerunRequestVNext: AbTestRerunRequestVNext): HttpResponse =
            rerunLandingPageTest(abTestRerunRequestVNext, RequestOptions.none())
    }
}
