package mapping

val ApiEndpointsVTokenSchemeMap
    get() = ApiEndpointsVHeaders.map { (version, domains) ->
        version to domains.map { (domain, headers) ->
            domain to headers.values.first()
        }.toMap()
    }.toMap()

val ApiEndpointsVHeaders = mapOf(
    "24.04.0003.58698" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-Token" to "{UUID}-{name}-{appCustomerDb}-{appVersion}",
        ),
    ),
    "24.04.0004.58722" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-Token" to "{UUID}-{appCustomerDb}-{appVersion}",
        ),
    ),
    "24.04.0005.58736" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-Token" to "{UUID}-{appCustomerDb}-{appVersion}-{apiKey}",
        ),
    ),
    "24.04.0006.58753" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-Token" to "{UUID}-{appCustomerDb}-{appVersion}-{apiKey}",
        ),
    ),
    "24.04.0007.58773" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-Token" to "{UUID}-{appCustomerDb}-{appVersion}-{apiKey}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-Token" to "{UUID}-{appCustomerDb}-{appVersion}-{apiKey}",
        ),
    ),
    "24.04.0008.58830" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-Apitoken" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{appVersion}-{apiKey}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-Apitoken" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{appVersion}-{apiKey}",
        ),
    ),
    "24.04.0009.58848" to mapOf(
        // "uonetplus-wiadomosciplus" to mapOf(
        //     "V-Apitoken" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{appVersion}-{apiKey}",
        // ),
        "uonetplus-uczenplus" to mapOf(
            "V-Apitoken" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{appVersion}-{apiKey}",
        ),
    ),
    "24.04.0010.58863" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{appVersion}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{appVersion}-{apiKey}",
        ),
    ),
    "24.05.0000.59033" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
    ),
    "24.05.0001.59063" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
    ),
    "24.05.0002.59079" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
    ),
    "24.05.0003.59126" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
    ),
    "24.06.0002.59394" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
    ),
    "24.07.0000.59496" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
    ),
    "24.07.0001.59644" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
    ),
    "24.07.0003.59704" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
    ),
    "24.07.0005.59728" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
        "uonetplus-uczen" to mapOf(
            "V-TokenApi" to "{%UUID%}-{%vTokenApiIndexed%}",
        ),
        "uonetplus-uczenplus" to mapOf(
            "V-TokenApi" to "{UUID}-{appCustomerDb}-{appCustomerDbSig}-{apiKey}",
        ),
    ),
)
